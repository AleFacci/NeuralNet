public class SigNeuron extends Neuron{
        public SigNeuron(){
                super();
        }

        @Override
        protected double activate(double s){
                if (s <= -10)
                        return 0; 
                else if (s >= 10)
                        return 1;
                else
                        return 1 / (1 + Math.exp(-s));
        }
}
