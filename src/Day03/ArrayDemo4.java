package Day03;

public class ArrayDemo4 {
				public static void main(String[] args) {
					int [ ] arr ={34,19,11,109,3,56};
					int max =getMax(arr);
					System.out.println("max="+max);
				}
	/*
	 * ��ȡ�����е����ֵ��
	 * ˼·��
	 * 1.��Ҫ���бȽϣ������������¼ÿ�αȽϺ�ϴ��ֵ��
	 * 2.�������е�Ԫ�ؽ��б���ȡ�����ͱ����еļ�¼��Ԫ�ؽ��бȽϡ�
	 * 3.����������ñ�����¼�������ֵ��
	 * 
	 * 
	 * ����һ��������ʵ�֡�
	 * ��ȷһ�������
	 * �������е�Ԫ�ء�int
	 * ��ȷ����δ֪���ݡ�
	 * ����
	 */
					
	public static int getMax(int[] arr)
	{
			int max=arr[0];
			for(int x=0; x<arr.length;x++)
			{
				if(arr[x]>max)
				max=arr[x];
			}
			return max;
		}
}

