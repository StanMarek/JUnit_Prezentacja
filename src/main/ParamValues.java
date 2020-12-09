package main;

public enum ParamValues {

    CAR_MILLAGE(0, 20000),
    FUEL_USAGE(0, 15),
    TREAD_THICKNESS(0, 10);
    //TREAD_THICKNESS(0, 10);


    private Integer minVal;
    private Integer maxVal;

    ParamValues(Integer minVal, Integer maxVal){

        this.maxVal = maxVal;
        this.minVal = minVal;
    }

    public Integer getMinVal(){
        return minVal;
    }

    public Integer getMaxVal(){
        return maxVal;
    }
}
