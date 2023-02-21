import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public abstract class Neuron{

        protected LinkedList<Double> inputs = new LinkedList<>();
        protected double weigth = 0.0;

        public Neuron(){
                this.weigth = generateRandomW();
        }

        public void clearInputs(){
                this.inputs = new LinkedList<>(); 
        }

        public void setInputs(Double aInput){
                this.inputs.push(aInput);
        }

        protected double generateRandomW(){
                return ThreadLocalRandom.current().nextDouble() * 100;
        }
        
        public void setWeigth(double w){
                this.weigth = w; 
        }

        public double getOutput(){
                return calculateOutput();  
        }

        public double calculateOutput(){
                double sum = this.inputs.stream().collect(Collectors.summingDouble(Double::doubleValue));
                sum = sum*this.weigth;
                sum = activate(sum);
                return sum;
        }

        abstract protected double activate(double s);
}
