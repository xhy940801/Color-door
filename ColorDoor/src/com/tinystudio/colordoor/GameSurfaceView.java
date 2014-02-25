package com.tinystudio.colordoor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class GameSurfaceView extends SurfaceView implements Callback, Runnable
{
	private SurfaceHolder holder;
	private Thread thread;
	
	private boolean isRun;
	
	public GameSurfaceView(Context context)
	{
		super(context);
		holder = this.getHolder();
		holder.addCallback(this);
	}

	public GameSurfaceView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public GameSurfaceView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{
		isRun = true;
		while(isRun)
		{
			
		}
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceCreated(SurfaceHolder holder)
	{
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder)
	{
		isRun = false;
	}

}
