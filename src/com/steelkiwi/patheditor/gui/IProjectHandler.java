package com.steelkiwi.patheditor.gui;

import javax.swing.tree.TreePath;

import com.steelkiwi.patheditor.proj.ScreenData;

public interface IProjectHandler {
	public void onProjectCreated(String name, String path);
	public void onProjectOpened(String path);
	public boolean onProjectedSaved(boolean showSaveSuccessMsg);
	public void onProjectClosed();
	
	public void onScreenAdded(String name, int w, int h);
	public void onScreenSwitched(ScreenData scrData, TreePath path);
	public void onRootSwitched();
	
	public void onBGImageAdded(String name, String path, float scaleCoef);
	public void onLeafSwitched(String name, TreePath path);
	
	public void onPathCreate(String name, int pointsCnt, String controlColor, String segmentColor, String selectColor);
	public void onPathVertexAdd();
	public void onPathVertexEdit();
	public void onPathVertexInsert();
	public void onPathVertexRemove();
	public void onPathClear();
}
