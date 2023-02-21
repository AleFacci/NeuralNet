import java.util.LinkedList;

public class ReLuNeuron extends Neuron{
        public ReLuNeuron(){
                super();
        }

        @Override
        protected double activate(double s){
                if(s > 0)
                        return s;
                else
                        return 0;

        }
}
