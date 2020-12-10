package test;
import main.*;
import org.junit.jupiter.api.*;

class CarServiceTestProb {

    private CarService serwis;

    @BeforeEach
    public void setUpEach(){

        serwis = new CarService();
        System.out.println("SET UP");
        System.out.flush();
    }

    @BeforeAll
    public static void setUpClass(){

        System.out.println("SET UP ClASS");
        System.out.flush();
    }

    @Test
    public void analyzeCarByParams_millageNull_throwsIllegalArgumentException(){

        //given - przygotowujemy dane testowe
        Integer treadThickness = 5;
        Integer fuelUsage = 3;
        Integer carMillage = null;
        //CarService serwis = new CarService();

        //when - wykonujemy test
        //boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then - sprawdzamy czy rezultat jest taki jak oczekiwany
        Assertions.assertThrows(IllegalArgumentException.class, () -> serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_treadNull_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = null;
        Integer fuelUsage = 3;
        Integer carMillage = 100;
        //CarService serwis = new CarService();

        //when
        //boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_fuelNull_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = 5;
        Integer fuelUsage = null;
        Integer carMillage = 100;
        //CarService serwis = new CarService();

        //when
        //boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_allParamsGood_resultTrue(){

        //given
        Integer treadThickness = 5;
        Integer fuelUsage = 3;
        Integer carMillage = 10;
        //CarService serwis = new CarService();

        //when
        boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_allParamsNull_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = null;
        Integer fuelUsage = null;
        Integer carMillage = null;
        //CarService serwis = new CarService();

        //when
        //boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(true, result);
        Assertions.assertThrows(IllegalArgumentException.class, () -> serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_allParamsMin_throwsTrue(){

        //given
        Integer treadThickness = 1;
        Integer fuelUsage = 1;
        Integer carMillage = 1;
        //CarService serwis = new CarService();

        //when
        boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_allParamsMax_throwsTrue(){

        //given
        Integer treadThickness = 10;
        Integer fuelUsage = 15;
        Integer carMillage = 20000;
        //CarService serwis = new CarService();

        //when
        boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_allParams0_throwsFalse(){

        //given
        Integer treadThickness = 0;
        Integer fuelUsage = 0;
        Integer carMillage = 0;
        //CarService serwis = new CarService();

        //when
        boolean result = serwis.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(true, result);
        //Assertions.assertTrue(!result);
        Assertions.assertFalse(result);
    }

    @AfterEach
    public void tearDownEach(){

        System.out.println("TEAR DOWN");
        System.out.flush();
    }

    @AfterAll
    public static void tearDownClass(){

        System.out.println("TEAR DOWN CLASS");
        System.out.flush();
    }
}

