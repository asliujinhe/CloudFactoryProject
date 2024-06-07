package com.lta.dao;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class TableEmbedCheckbox extends AbstractTableModel {
	
	//�չ��죬�������κβ���
	public TableEmbedCheckbox() { 
	}
	private String[] colNames;
	private Object[][]  datas; 
	public void setColNames(String[] colNames) {
		this.colNames = colNames;
	}
	public void setDatas(Object[][] datas) {
		this.datas = datas;
	}
	//��������������һ���չ��컥���Ϊ����
	public TableEmbedCheckbox(String[] colNames,Object[][]  datas) { 
		this.colNames=colNames;
		this.datas=datas;
	}
	//��������������һ�������������Ϊ����
	public TableEmbedCheckbox(Object[][]  datas,String[] colNames) { 
		this.datas=datas;
		this.colNames=colNames;
	} 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5363496293435299562L; 	
    //�Զ����
    public Class<?> getColumnClass(int c) { 
    	return datas[0][c].getClass();//ÿһ������
    }
    @Override
    public String getColumnName(int column) { 
    	return colNames[column];//����
    }
    @Override
    public void setValueAt(Object v, int r, int c) { 
    	datas[r][c]=v;//�ı���ֵ
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) { 
    	//ʹĳһ�в��ɱ༭����false,�ɱ༭����true
    	if(columnIndex==1)//��0��ʼ����������Ǳ�Ų��ɱ༭Ϊ1
    	{
    		return false;
    	}else{
    		return true;//������Ϊ1���в����Ա༭������˫�������޸�����
    	} 
    }
    
    //����
	@Override
	public int getColumnCount() { 
		return colNames.length; 
	}

	@Override
	public int getRowCount() { 
		return datas.length; 
	}

	@Override
	public Object getValueAt(int r, int c) {		 
		return datas[r][c];//��������
	}

}
