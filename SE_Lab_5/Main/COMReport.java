package Main;

import java.io.FileNotFoundException;

import DA.BlockSectionDA;
import List.BlockSection;

public class COMReport {

    public static void main(String[] args) throws FileNotFoundException {

        // Andrew Felix Cunanan
        
        new COMReport();
    }

    public COMReport() throws FileNotFoundException {

        BlockSectionDA blockSectionDA = new BlockSectionDA();
        BlockSection blockSection = blockSectionDA.getBlockSection();

        System.out.println("Block Section: " + blockSection.getBlockCode() + "\t\t\t" + "Block Section Description: "
                + blockSection.getDescription());
        System.out.println("Class Adviser: " + blockSection.getAdviser());

        blockSectionDA.printer();
    }
}