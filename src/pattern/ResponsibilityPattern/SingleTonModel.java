package pattern.ResponsibilityPattern;

/**
 *   单例设计模式
 */
public class SingleTonModel {

        public static  SingleTonModel singleTonModel = null;

        private  SingleTonModel(){

        }

        public  static SingleTonModel getInstance(){
              return singleTonModel = new SingleTonModel();
        }

}
