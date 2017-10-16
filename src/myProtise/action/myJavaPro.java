package myProtise.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import myProtise.bean.Fruit;

public class myJavaPro {

	private static List<Fruit> findMyFruit(List<Fruit> list){
		List<Fruit> result = new ArrayList<Fruit>();
		for(Fruit f:list){
			if("green".equals(f.getName())){
				result.add(f);
			}
		}
		return result;
	}
	public static void main(String[] args){
		List<Fruit> aa = Arrays.asList(new Fruit("green",2,"11"),new Fruit("blue",2,"11"),new Fruit("black",2,"11"));
		List<Fruit> b =	findMyFruit(aa);
		System.out.println(b.size());
		String[] a = new String[]{"1","2"};
		String[] ab = {"2d","21"};
		System.out.println(ab);
	}
}
