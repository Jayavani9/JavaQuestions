class Vehicle{

    Vehicle(String license)
    {
        this.license = license;
    }

    String getLicense()
    {
        return license;
    }
}


class Level{
    int floor;
    int[] spots;

    Level(int floor, int numOfSpots)
    {
        this.floor = floor;
        this.spots = new int[numOfSpots];
    }

    int getFloor()
    {
        return floor;
    }

    int[] getSpots()
    {
        return spots;
    }
}


class ParkingLot{
    Level[] levels;

    ParkingLot(int numOfLevels, int spotsPerLevel)
    {
        levels = new Level[numOfLevels];
        for(int i = 0; i < numOfLevels; i++)
        {
            levels[i] = new Level(i, spotsPerLevel);
        }
    }

    boolean parkVehicle(Vehicle vehicle)
    {
        for(Level level:levels)
        {
            int[] spots = level.getSpots();
            for(int i = 0; i < spots.length; i++)
            {
                if(spots[i] == 0)
                {
                    spots[i] = 1;
                    return true;
                } 
            }
        }
        return false;
    }

    boolean removeVehicle(Vehicle vehicle)
    {
        for(Level level:levels)
        {
            int[] spots = level.getSpots();
            for(int i = 0; i < spots.length; i++)
            {
                if(spots[i] == 1)
                {
                    spots[i] = 0;
                    return true;
                } 
            }
        }
        return false;
    }
}
