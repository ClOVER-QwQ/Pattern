package org.clover.facade;

import org.clover.facade.subclasses.BrickLayer;
import org.clover.facade.subclasses.BrickWorker;
import org.clover.facade.subclasses.Mason;

public class LabourContractor {
   private final BrickLayer brickLayer = new BrickLayer();
   private final BrickWorker brickWorker = new BrickWorker();
   private final Mason mason = new Mason();

   public void buildHouse(){
       mason.mix();
       brickWorker.carry();
       brickLayer.neat();
       System.out.println("房子建好了");
   }
}
