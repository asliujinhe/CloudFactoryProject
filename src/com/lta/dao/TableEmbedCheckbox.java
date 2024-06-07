package com.lta.dao;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class TableEmbedCheckbox extends AbstractTableModel {
	
	//空构造，不接收任何参数
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
	//带参数构造与上一个空构造互相称为重载
	public TableEmbedCheckbox(String[] colNames,Object[][]  datas) { 
		this.colNames=colNames;
		this.datas=datas;
	}
	//带参数构造与上一个带参数互相称为重载
	public TableEmbedCheckbox(Object[][]  datas,String[] colNames) { 
		this.datas=datas;
		this.colNames=colNames;
	} 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5363496293435299562L; 	
    //自定义的
    public Class<?> getColumnClass(int c) { 
    	return datas[0][c].getClass();//每一行类型
    }
    @Override
    public String getColumnName(int column) { 
    	return colNames[column];//列名
    }
    @Override
    public void setValueAt(Object v, int r, int c) { 
    	datas[r][c]=v;//改变其值
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) { 
    	//使某一列不可编辑返回false,可编辑返回true
    	if(columnIndex==1)//从0开始索引，如果是编号不可编辑为1
    	{
    		return false;
    	}else{
    		return true;//除索引为1的列不可以编辑，其余双击鼠标可修改数据
    	} 
    }
    
    //生成
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
		return datas[r][c];//两行数据
	}

}
