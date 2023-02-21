import java.util.LinkedList;

public class NeuralLayer{

        private LinkedList<Neuron> neurons = new LinkedList<>();

        private NeuralLayer prox = null;

        public NeuralLayer(LinkedList<Neuron> aNeurons){
                this.neurons = aNeurons;
        }

        public void setProx(NeuralLayer aLayer){
                this.prox = aLayer;
        }

        public LinkedList<Neuron> getNeurons(){
                return this.neurons;
        }

        public void start(){
                if(this.prox == null){
                        SigNeuron last = new SigNeuron();
                        for (Neuron neuron : neurons) {
                                last.setInputs(neuron.calculateOutput());
                        }
                        double result = last.calculateOutput();
                        return;
                }
                for (Neuron n : this.neurons) {
                        for (Neuron neuron : this.prox.getNeurons()) {
                                neuron.setInputs(((ReLuNeuron)n).calculateOutput());
                        }
                }
        }
}
