package com.google.androidgamesdk;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.exoplayer2.C;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class SwappyDisplayManager implements DisplayManager.DisplayListener {
    private Activity mActivity;
    private long mCookie;
    private Display.Mode mCurrentMode;
    private b mLooper;
    private WindowManager mWindowManager;
    private final String LOG_TAG = "SwappyDisplayManager";
    private final boolean DEBUG = false;
    private final long ONE_MS_IN_NS = 1000000;
    private final long ONE_S_IN_NS = C.NANOS_PER_SECOND;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f27930w;

        public a(int i10) {
            this.f27930w = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Window window = SwappyDisplayManager.this.mActivity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.preferredDisplayModeId = this.f27930w;
            window.setAttributes(attributes);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Thread {

        /* renamed from: w  reason: collision with root package name */
        public Handler f27932w;

        /* renamed from: x  reason: collision with root package name */
        public Lock f27933x;

        /* renamed from: y  reason: collision with root package name */
        public Condition f27934y;

        public b() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f27933x = reentrantLock;
            this.f27934y = reentrantLock.newCondition();
        }

        public /* synthetic */ b(SwappyDisplayManager swappyDisplayManager, byte b10) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Log.i("SwappyDisplayManager", "Starting looper thread");
            this.f27933x.lock();
            Looper.prepare();
            this.f27932w = new Handler();
            this.f27934y.signal();
            this.f27933x.unlock();
            Looper.loop();
            Log.i("SwappyDisplayManager", "Terminating looper thread");
        }

        @Override // java.lang.Thread
        public final void start() {
            this.f27933x.lock();
            super.start();
            try {
                this.f27934y.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            this.f27933x.unlock();
        }
    }

    public SwappyDisplayManager(long j10, Activity activity) {
        String string;
        try {
            Bundle bundle = activity.getPackageManager().getActivityInfo(activity.getIntent().getComponent(), 128).metaData;
            if (bundle != null && (string = bundle.getString("android.app.lib_name")) != null) {
                System.loadLibrary(string);
            }
        } catch (Throwable th2) {
            Log.e("SwappyDisplayManager", th2.getMessage());
        }
        this.mCookie = j10;
        this.mActivity = activity;
        WindowManager windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
        this.mWindowManager = windowManager;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        this.mCurrentMode = defaultDisplay.getMode();
        updateSupportedRefreshRates(defaultDisplay);
        DisplayManager displayManager = (DisplayManager) this.mActivity.getSystemService(DisplayManager.class);
        synchronized (this) {
            b bVar = new b(this, (byte) 0);
            this.mLooper = bVar;
            bVar.start();
            displayManager.registerDisplayListener(this, this.mLooper.f27932w);
        }
    }

    private boolean callNativeCallback() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return i10 == 29 && Build.VERSION.PREVIEW_SDK_INT == 0;
        }
        return true;
    }

    private boolean modeMatchesCurrentResolution(Display.Mode mode) {
        return mode.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() && mode.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth();
    }

    private native void nOnRefreshRateChanged(long j10, long j11, long j12, long j13);

    private native void nSetSupportedRefreshRates(long j10, long[] jArr, int[] iArr);

    private void updateSupportedRefreshRates(Display display) {
        Display.Mode[] supportedModes = display.getSupportedModes();
        int i10 = 0;
        for (Display.Mode mode : supportedModes) {
            if (modeMatchesCurrentResolution(mode)) {
                i10++;
            }
        }
        long[] jArr = new long[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < supportedModes.length; i12++) {
            if (modeMatchesCurrentResolution(supportedModes[i12])) {
                jArr[i11] = 1.0E9f / supportedModes[i12].getRefreshRate();
                iArr[i11] = supportedModes[i12].getModeId();
                i11++;
            }
        }
        nSetSupportedRefreshRates(this.mCookie, jArr, iArr);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i10) {
        synchronized (this) {
            Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            Display.Mode mode = defaultDisplay.getMode();
            boolean z10 = true;
            boolean z11 = (mode.getPhysicalWidth() != this.mCurrentMode.getPhysicalWidth()) | (mode.getPhysicalHeight() != this.mCurrentMode.getPhysicalHeight());
            if (refreshRate == this.mCurrentMode.getRefreshRate()) {
                z10 = false;
            }
            this.mCurrentMode = mode;
            if (z11) {
                updateSupportedRefreshRates(defaultDisplay);
            }
            if (callNativeCallback() && z10) {
                long j10 = 1.0E9f / refreshRate;
                nOnRefreshRateChanged(this.mCookie, j10, defaultDisplay.getAppVsyncOffsetNanos(), j10 - (this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos() - 1000000));
            }
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i10) {
    }

    public void setPreferredRefreshRate(int i10) {
        this.mActivity.runOnUiThread(new a(i10));
    }

    public void terminate() {
        this.mLooper.f27932w.getLooper().quit();
    }
}
