package pattern.ResponsibilityPattern;

/**
 *   单例设计模式
 */
public class SingleTonModel {

        private  static  SingleTonModel singleTonModel = null;

        private  SingleTonModel(){

        }

        public  static SingleTonModel getInstance(){
              return singleTonModel = new SingleTonModel();
        }

}
