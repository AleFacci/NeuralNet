import java.util.LinkedList;

public class NeuralNet{
        
        private LinkedList<NeuralLayer> layers = new LinkedList<>();

        public NeuralNet(LinkedList<NeuralLayer> aLayers){
                this.layers = aLayers;
        }
}
