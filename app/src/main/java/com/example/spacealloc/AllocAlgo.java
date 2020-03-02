package com.example.spacealloc;

import java.util.ArrayList;

public class AllocAlgo{
    public static void runAlgo(ArrayList<Block> blockList, ArrayList<Booth> boothList,ArrayList<Booth> boothListcopy){
        for(Block block:blockList){
            if (boothList.size() == 0){
                break;
            }else{
                runBlock(block,boothList,boothListcopy);
            }
        }
        /*if(boothList.size()!=0){
           runAlgo(blockList,boothList);
        }*/

    }


    public static void runBlock(Block block, ArrayList<Booth> boothList, ArrayList<Booth> boothListcopy){
        double unusedSpace = block.getLength();


        for(int i=0;i<boothListcopy.size();i++){
            Booth booth = boothListcopy.get(i);
            if (unusedSpace > 0) {
                if (booth.getWidth()<=block.getWidth()) {
                    if(block.getBoothList().size()==0) {
                        block.getBoothList().add(booth);
                        boothList.remove(booth);

                        //System.out.println(booth.getBoothID()+ "this booth is removed in first round");
                        unusedSpace -= booth.getLength();
                    }else{

                        //System.out.println(block.getBoothList().get(block.getBoothList().size()-1).getBoothType());
                        //System.out.println(booth.getBoothType());
                        if(block.getBoothList().get(block.getBoothList().size()-1).getBoothType()!= booth.getBoothType()){
                            block.getBoothList().add(booth);
                            boothList.remove(booth);
                            //System.out.println(booth.getBoothID()+ "this booth is removed second");
                            unusedSpace-=booth.getLength();
                        }
                    }
                    System.out.println(i);
                }
                if(unusedSpace <= 0){
                    break;
                }
            }else{
                break;
            }
        }

        for(Booth booth : block.getBoothList()){   //remove those booth that has been allocated
            boothListcopy.remove(booth);
        }

        if(unusedSpace>0 && boothList.size()!=0){
            runBlock(block,boothList,boothListcopy,unusedSpace);
        }



    }

    public static void runBlock(Block block, ArrayList<Booth> boothList,ArrayList<Booth> boothListcopy,double unusedSpace){
        //after connecting to the database, here need to check the min value of booth width and compare to the unused space
        //if unused space< min of the booth width remaining, do nothing, else do a recursion


        for(int i=0;i<boothListcopy.size();i++){
            Booth booth = boothListcopy.get(i);
            if (unusedSpace > 0) {
                if (booth.getWidth()<=block.getWidth()) {
                    if(block.getBoothList().size()==0) {
                        block.getBoothList().add(booth);
                        boothList.remove(booth);

                        //System.out.println(booth.getBoothID()+ "this booth is removed in first round");
                        unusedSpace -= booth.getLength();
                    }else{

                        //System.out.println(block.getBoothList().get(block.getBoothList().size()-1).getBoothType());
                        //System.out.println(booth.getBoothType());
                        if(block.getBoothList().get(block.getBoothList().size()-1).getBoothType()!= booth.getBoothType()){
                            block.getBoothList().add(booth);
                            boothList.remove(booth);
                            //System.out.println(booth.getBoothID()+ "this booth is removed second");
                            unusedSpace-=booth.getLength();
                        }
                    }
                    System.out.println(i);
                }
                if(unusedSpace <= 0){
                    break;
                }
            }else{
                break;
            }
        }

        for(Booth booth : block.getBoothList()){   //remove those booth that has been allocated
            boothListcopy.remove(booth);
        }
        }

    }

