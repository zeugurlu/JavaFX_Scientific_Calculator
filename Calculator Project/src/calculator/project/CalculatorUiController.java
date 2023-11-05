package calculator.project;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class CalculatorUiController implements Initializable {

    @FXML
    private GridPane gridPane;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button times;
    @FXML
    private Button devide;
    @FXML
    private Button reset;
    @FXML
    private Button percent;
    @FXML
    private Button nine;
    @FXML
    private Button six;
    @FXML
    private Button three;
    @FXML
    private Button equal;
    @FXML
    private Button piNum;
    @FXML
    private Button eight;
    @FXML
    private Button five;
    @FXML
    private Button two;
    @FXML
    private Button dot;
    @FXML
    private Button eNum;
    @FXML
    private Button ln;
    @FXML
    private Button seven;
    @FXML
    private Button log;
    @FXML
    private Button four;
    @FXML
    private Button one;
    @FXML
    private Button sqrRoot;
    @FXML
    private Button zero;
    @FXML
    private Button power;
    @FXML
    private Button answer;
    @FXML
    private Button cot;
    @FXML
    private Button tan;
    @FXML
    private Button cos;
    @FXML
    private Button sin;
    @FXML
    private Label resultScreen;
    @FXML
    private Label warnLabel;

    //Anlık ekranda yazması gereken sayı(Son hali ilk sayı olarak kayıt edilecek)
    Double tmpNumber = 0.0;

    //Noktaya basılıp basılmadığını tutacak
    boolean dotClicket = false;
    //Virgülden sonraki basamak sayısını tutacak
    int decimalCounter = 1;

    String operation = "";
    Double firstNum = 0.0;
    Double secondNum = 0.0;
    Double result = null;
    boolean oneNumberCalc = false;
    Double ansNum = 0.0;
    boolean isResultOnScreen = false;

    //Calculation yaparken iki tane sayı ve tek sayı gerektiren calculationlara göre ayırmamız lazım , ayrıca sayı işlemden önce mi sonra mı gelecek. Ona göre 3 gruba ayırdık.
    ArrayList<String> oneFirCalculation = new ArrayList<>();
    ArrayList<String> oneSecCalculation = new ArrayList<>();
    ArrayList<String> twoCalculation = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Eren
        //Tek sayı ama işlem operatörünün sayıdan önce girilmesi gereken işlemler
        this.oneSecCalculation.add("sin");
        this.oneSecCalculation.add("cos");
        this.oneSecCalculation.add("tan");
        this.oneSecCalculation.add("cot");
        this.oneSecCalculation.add("log");
        this.oneSecCalculation.add("ln");

        //Tek sayı ama işlem operatörünün sayıdan sonra girilmesi gereken işlemler
        this.oneFirCalculation.add("fac");
        this.oneFirCalculation.add("per");
        this.oneFirCalculation.add("sqrt");

        //İki tanse sayı gerektiren işlemler
        this.twoCalculation.add("+");
        this.twoCalculation.add("-");
        this.twoCalculation.add("x");
        this.twoCalculation.add("/");
        this.twoCalculation.add("x^y");

    }
//Zehra
    private boolean checkDouble(double num) {
        boolean bool = false;
        try {
            bool = num % 1.0 == 0.0;

        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
        return bool;

    }
    //number click action

    @FXML
    //Zehra
    private void nineOnClick(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (9.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 9;

                System.out.println(checkDouble(this.tmpNumber));
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }

            this.isResultOnScreen = false;
        } catch (Exception e) {
            System.out.println(e);
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void eightOnAction(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (8.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 8;

                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void sevenOnClick(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (7.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 7;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void sixOnClick(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (6.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 6;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void fiveOnAction(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (5.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 5;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void fourOnClick(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (4.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 4;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void threeOnAction(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (3.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 3;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void twoOnAction(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (2.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 2;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void oneOnClick(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (1.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10 + 1;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void zeroOnClick(ActionEvent event) {
        try {
            if (this.dotClicket) {
                this.tmpNumber = this.tmpNumber + (0.0 / Math.pow(10, this.decimalCounter));
                this.decimalCounter += 1;
                this.resultScreen.setText(this.tmpNumber.toString());
            } else {
                this.tmpNumber = this.tmpNumber * 10;
                if (checkDouble(this.tmpNumber)) {

                    Integer i = this.tmpNumber.intValue();

                    this.resultScreen.setText(i.toString());
                } else {
                    this.resultScreen.setText(this.tmpNumber.toString());
                }
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void plusOnClick(ActionEvent event) {
        try {
            if (this.operation.equals("")) {
                this.operation = "+";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");

        }

    }

    @FXML
    //Eren
    private void minusOnClick(ActionEvent event) {

        try {
            if (this.operation.equals("")) {
                this.operation = "-";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("");
            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }

    }

    @FXML
    //Eren
    private void timesOnClick(ActionEvent event) {
        try {
            if (this.operation.equals("")) {
                this.operation = "x";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void devideOnClick(ActionEvent event) {
        try {
            if (this.operation.equals("")) {
                this.operation = "/";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    private void powerOnClick(ActionEvent event) {
        try {
            if (this.operation.equals("")) {
                this.operation = "x^y";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void resetOnClick(ActionEvent event) {
        try {

            this.firstNum = 0.0;
            this.secondNum = 0.0;
            this.operation = "";
            this.dotClicket = false;
            this.decimalCounter = 1;
            this.tmpNumber = 0.0;
            this.warnLabel.setText("");
            this.resultScreen.setText("0");
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void equalOnAction(ActionEvent event) throws InterruptedException {

        System.out.println(this.operation + this.oneSecCalculation.contains(this.operation) + " ");

        try {

            //Çift sayılı ilemler
            if (this.twoCalculation.contains(this.operation)) {
                this.secondNum = this.tmpNumber;
                System.out.println(this.firstNum + " " + this.operation + " " + this.secondNum);
                if (this.operation.equals("+")) {
                    this.result = this.firstNum + this.secondNum;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("-")) {
                    this.result = this.firstNum - this.secondNum;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("x")) {
                    this.result = this.firstNum * this.secondNum;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("/")) {
                    this.result = this.firstNum / this.secondNum;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("x^y")) {
                    this.result = Math.pow(this.firstNum, this.secondNum);
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else {
                    this.warnLabel.setText("Enter an operation!!");

                }

            }//Tek sayılı ilk sayı inputu alınan işlemler
            else if (this.oneFirCalculation.contains(this.operation)) {

                if (this.operation.equals("fac")) {
                    Double tmp = 1.0;
                    for (Double i = this.firstNum; i > 0.0; i--) {
                        tmp *= i;
                    }

                    this.result = tmp;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("per")) {

                    this.result = this.firstNum / 100.0;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("sqrt")) {
                    this.result = Math.pow(this.firstNum, 1.0 / 2.0);
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;
                } else {
                    this.warnLabel.setText("Enter an operation!!");
                }
            }//Tek sayılı ilk işlem inputu alınan işlemler
            else if (this.oneSecCalculation.contains(this.operation)) {

                if (this.operation.equals("sin")) {

                    Double angleInRadians = Math.toRadians(this.tmpNumber); // Convert degrees to radians
                    Double value = Math.sin(angleInRadians);
                    System.out.println(angleInRadians + " " + value);
                    this.result = value;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;
                } else if (this.operation.equals("cos")) {
                    Double angleInRadians = Math.toRadians(this.tmpNumber); // Convert degrees to radians
                    Double value = Math.cos(angleInRadians);
                    this.result = value;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("tan")) {
                    Double angleInRadians = Math.toRadians(this.tmpNumber); // Convert degrees to radians
                    Double value = Math.tan(angleInRadians);
                    this.result = value;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("cot")) {
                    Double angleInRadians = Math.toRadians(this.tmpNumber); // Convert degrees to radians
                    Double value = 1.0 / Math.tan(angleInRadians);
                    this.result = value;
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("log")) {
                    this.result = Math.log10(this.tmpNumber);
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;

                } else if (this.operation.equals("ln")) {
                    this.result = Math.log(this.tmpNumber);
                    this.resultScreen.setText(this.result.toString());
                    this.firstNum = 0.0;
                    this.secondNum = 0.0;
                    this.operation = "";
                    this.dotClicket = false;
                    this.decimalCounter = 1;
                    this.tmpNumber = 0.0;
                    this.warnLabel.setText("");
                    this.ansNum = this.result;
                    this.isResultOnScreen = true;
                } else {
                    this.warnLabel.setText("Enter an operation!!");
                }

            } else {
                this.warnLabel.setText("Enter an operation!!");
            }

        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
            Thread.sleep(3000);

        } finally {
            this.warnLabel.setText("Click the reset button to make new calculation!!");
        }
    }

    @FXML
    //Eren
    private void facOnAction(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }

            if (this.operation.equals("")) {
                this.operation = "fac";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("Enter the = button to calculate " + this.firstNum + "!");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void percentOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "per";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("");
                this.warnLabel.setText("Enter click the = button to calculate " + this.firstNum + "%");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void piNumOnClick(ActionEvent event) {
        try {
            this.tmpNumber += Math.PI;
            this.resultScreen.setText(this.tmpNumber.toString());
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void dotOnClick(ActionEvent event) {
        try {
            this.dotClicket = true;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Zehra
    private void eNumOnClick(ActionEvent event) {
        try {
            this.tmpNumber += Math.E;
            this.resultScreen.setText(this.tmpNumber.toString());
            this.isResultOnScreen = false;
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void sqrRootOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "sqrt";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("Click the = button to calculate " + this.firstNum + "^(1/2)");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void answerOnClick(ActionEvent event) {
        try {

            if (this.operation.equals("") && this.result == null) {
                this.warnLabel.setText("There was no answer");
            }

            if (!this.operation.equals("") && this.result != null) {
                this.secondNum = this.ansNum;
                this.tmpNumber = this.ansNum;
                this.resultScreen.setText(this.secondNum.toString());

                System.out.println(this.firstNum + " " + this.secondNum + " ans number" + this.ansNum);
            }
            if (!this.operation.equals("") && this.result == null) {
                this.warnLabel.setText("There was no answer");
            }
            if (this.operation.equals("") && this.result != null) {
                this.firstNum = this.ansNum;
                this.tmpNumber = this.ansNum;

                this.resultScreen.setText(this.firstNum.toString());

                System.out.println(this.firstNum + " " + this.secondNum + " ans number" + this.ansNum);

            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }

    }

    @FXML
    //Eren
    private void cotOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "cot";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("cot");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void tanOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "tan";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("tan");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    
    private void cosOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "cos";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("cos");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void sinOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "sin";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("sin");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void logOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "log";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("log");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }

    @FXML
    //Eren
    private void lnOnClick(ActionEvent event) {
        try {
            if (this.isResultOnScreen) {
                this.warnLabel.setText("Please enter a number before click an operation");
            }
            if (this.operation.equals("")) {
                this.operation = "ln";
                this.firstNum = this.tmpNumber;
                this.tmpNumber = 0.0;
                this.dotClicket = false;
                this.decimalCounter = 1;
                this.warnLabel.setText("ln");

            } else {
                this.warnLabel.setText("You are on " + this.operation + " operation riht now. For make another operation click reset.");
            }
        } catch (Exception e) {
            this.warnLabel.setText("Something went wrong");
        }
    }
}