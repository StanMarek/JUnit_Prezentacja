package main;

public class CarService {

    public boolean isCorrect(Integer value, ParamValues paramValues){
        if(value < 0){
            throw new IllegalArgumentException("Zla wartosc");
        }
        Integer maxVal = paramValues.getMaxVal();
        Integer minVal = paramValues.getMinVal();

        if (value < maxVal && value > minVal) {
            return true;
        }
        return false;
    }

    public boolean analyzeCarByParams(Integer treadThickness, Integer fuelUsage, Integer carMillage){

        boolean treadThicknessNull = null == treadThickness;
        boolean fuelUsageNull = null == fuelUsage;
        boolean carMillageNull = null == carMillage;

        if(carMillageNull || fuelUsageNull || treadThicknessNull){
            throw new IllegalArgumentException("Wartosci nie moga byc nullem");
        }

        boolean isMillageCorrect = isCorrect(carMillage, ParamValues.CAR_MILLAGE);
        boolean isTreadCorrect = isCorrect(treadThickness, ParamValues.TREAD_THICKNESS);
        boolean isFuelUsageCorrect = isCorrect(fuelUsage, ParamValues.FUEL_USAGE);

        if(isFuelUsageCorrect && isMillageCorrect && isTreadCorrect){
            return true;
        }
        return false;
    }

}
