package com.example.spacealloc;

import java.util.ArrayList;

public class SpaceAlloc {
    public static void main(String[] args) {
        Booth booth1 = new Booth("booth1",boothType.AEROSPACE,5.0,2.0,1);
        Booth booth2 = new Booth("booth2",boothType.COMPUTER,5.0,2.0,2);
        Booth booth3 = new Booth("booth3",boothType.TRANSPORT,1.0,4.0,3);
        Booth booth4 = new Booth("booth4",boothType.TRANSPORT,1.0,2.0,4);
        

        Block block1campus = new Block(1,1,12,3);
        Block block2campus = new Block(1,2,10,3);
        Block block3campus = new Block(1,3,10,4);

        ArrayList<Booth> allBooth = new ArrayList<>();
        allBooth.add(booth1);
        allBooth.add(booth2);
        allBooth.add(booth3);
        allBooth.add(booth4);

        ArrayList<Booth> allBoothcopy = new ArrayList<>();
        allBoothcopy.add(booth1);
        allBoothcopy.add(booth2);
        allBoothcopy.add(booth3);
        allBoothcopy.add(booth4);

        ArrayList<Block> allBlock = new ArrayList<>();
        allBlock.add(block1campus);
        allBlock.add(block2campus);
        allBlock.add(block3campus);

        AllocAlgo.runAlgo(allBlock,allBooth,allBoothcopy);


        for (Block block: allBlock){
            System.out.println("\nthis block is block"+block.getBlockID() +"  it contains the following booths ");

            for(Booth booth: block.getBoothList()){
            System.out.println("booth ID is: "+booth.getBoothID()+" booth type is "+booth.getBoothType()+" booth length is"+
                    booth.getLength());
        }}

    }
}
