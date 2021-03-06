package uiowa.hhaim.GeneticDistances;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by kandula on 4/2/2018.
 */
public class AvgGDAllCladePairs {

    public static void main(String args[]){
        if(args.length == 2){

            String fileLocation = args[0].replace("\\","\\\\");
            BufferedReader br = null;
            FileReader fr = null;
            try{
                String sCurrentLine;

                br = new BufferedReader( new FileReader( fileLocation ) );
                ArrayList<String[]> buffer = new ArrayList<>();
                while ((sCurrentLine = br.readLine()) != null) {
                    buffer.add( sCurrentLine.trim().split( "\t" ) );
                }

                //for removing the header
                buffer.remove(0);
                ArrayList<Pair> dataPairs = new ArrayList<>(  );
                String[] seq1 = null, seq2 = null;
                for(String[] data: buffer) {
                    if (data.length != 3) {
                        System.out.println( "Wrongly formatted input file" );
                        System.exit( 0 );
                    }
                    seq1 = data[0].split( "\\." );
                    seq2 = data[1].split( "\\." );
                    if(seq1.length < 3 && seq2.length < 3 ){
                        System.out.println("Inaccurate data split");
                        System.out.println(data);
                        System.exit( 0 );
                    }
                    Pair newPair = new Pair( seq1[1] + "." + seq1[2], seq2[1] + "." + seq2[2] );
                    //removing the same env sample results as they are not necessary
                    if(newPair.env1.equals( newPair.env2 ))
                        continue;
                    int index = Pair.getIndexOfPair( dataPairs, newPair );
                    if (index != -1) {
                        newPair = dataPairs.get( index );
                        newPair.distances.add( Double.parseDouble( data[2] ) );
                    } else {
                        newPair.distances.add( Double.parseDouble( data[2] ) );
                        dataPairs.add( newPair );
                    }
                }
                PrintWriter writer = new PrintWriter(args[1].replace("\\","\\\\"));
                writer.append("Env1\tEnv2\tAverageGD\tGeoMeanGD\n");
                //Calculating the average
                for(Pair pair: dataPairs){
                    pair.calculateMean();
                    pair.calculateGeoMean();
                    writer.append(pair.env1+"\t"+pair.env2+"\t"+pair.average+"\t"+pair.geoMean+"\n");
                }
                writer.close();
                System.out.println("Calculations are accomplished");
            }
            catch(Exception e){
                System.out.println("Input file not found");
                e.printStackTrace();
            }
            finally{
                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();


                } catch (Exception ex) {

                    ex.printStackTrace();

                }
            }


        }
        else{
            System.out.println("Give [Genetic distances file location] in the arguments and output file location");
            System.exit(0);
        }
    }

}

