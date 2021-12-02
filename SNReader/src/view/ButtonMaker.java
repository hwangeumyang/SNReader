package view;

/*
 * 이 인터페이스의 존재도, 이 인터페이스를 구성하는 데 쓴 제너릭의 개념도 사실 필요는 없다고 생각하지만,
 * 한 번 써보자는 느낌으로 사용함.
 */

public interface ButtonMaker<T extends java.awt.Component> {
	public T make();
}
