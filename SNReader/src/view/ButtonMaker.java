package view;

/*
 * �� �������̽��� ���絵, �� �������̽��� �����ϴ� �� �� ���ʸ��� ���䵵 ��� �ʿ�� ���ٰ� ����������,
 * �� �� �Ẹ�ڴ� �������� �����.
 */

public interface ButtonMaker<T extends java.awt.Component> {
	public T make();
}
