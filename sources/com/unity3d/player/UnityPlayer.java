package com.unity3d.player;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import com.unity3d.player.h;
import com.unity3d.player.l;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class UnityPlayer extends FrameLayout implements IUnityPlayerLifecycleEvents {
    private static final int ANR_TIMEOUT_SECONDS = 4;
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final int RUN_STATE_CHANGED_MSG_CODE = 2269;
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    private Context mContext;
    private SurfaceView mGlView;
    private int mInitialScreenOrientation;
    private boolean mIsFullscreen;
    private BroadcastReceiver mKillingIsMyBusiness;
    private boolean mMainDisplayOverride;
    private int mNaturalOrientation;
    private OrientationEventListener mOrientationListener;
    private boolean mProcessKillRequested;
    private boolean mQuitting;
    public g mSoftInputDialog;
    private j mState;
    private l mVideoPlayerProxy;
    private GoogleARCoreApi m_ARCoreApi;
    private boolean m_AddPhoneCallListener;
    private AudioVolumeHandler m_AudioVolumeHandler;
    private Camera2Wrapper m_Camera2Wrapper;
    private ClipboardManager m_ClipboardManager;
    private final ConcurrentLinkedQueue m_Events;
    private a m_FakeListener;
    private HFPStatus m_HFPStatus;
    public e m_MainThread;
    private NetworkConnectivity m_NetworkConnectivity;
    private com.unity3d.player.f m_PersistentUnitySurface;
    private c m_PhoneCallListener;
    private h m_SplashScreen;
    private TelephonyManager m_TelephonyManager;
    private IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    private Uri m_launchUri;

    /* loaded from: classes4.dex */
    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f28426a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f28427b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f28428c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ int[] f28429d = {1, 2, 3};
    }

    /* loaded from: classes4.dex */
    public class c extends PhoneStateListener {
        private c() {
        }

        public /* synthetic */ c(UnityPlayer unityPlayer, byte b10) {
            this();
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i10, String str) {
            UnityPlayer.this.nativeMuteMasterAudio(i10 == 1);
        }
    }

    /* loaded from: classes4.dex */
    public enum d {
        PAUSE,
        RESUME,
        QUIT,
        SURFACE_LOST,
        SURFACE_ACQUIRED,
        FOCUS_LOST,
        FOCUS_GAINED,
        NEXT_FRAME,
        URL_ACTIVATED,
        ORIENTATION_ANGLE_CHANGE
    }

    /* loaded from: classes4.dex */
    public class e extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public Handler f28442a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28443b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28444c;

        /* renamed from: d  reason: collision with root package name */
        public int f28445d;

        /* renamed from: e  reason: collision with root package name */
        public int f28446e;

        /* renamed from: f  reason: collision with root package name */
        public int f28447f;

        /* renamed from: g  reason: collision with root package name */
        public int f28448g;

        /* renamed from: h  reason: collision with root package name */
        public int f28449h;

        private e() {
            this.f28443b = false;
            this.f28444c = false;
            this.f28445d = b.f28427b;
            this.f28446e = 0;
            this.f28449h = 5;
        }

        public /* synthetic */ e(UnityPlayer unityPlayer, byte b10) {
            this();
        }

        private void a(d dVar) {
            Handler handler = this.f28442a;
            if (handler != null) {
                Message.obtain(handler, UnityPlayer.RUN_STATE_CHANGED_MSG_CODE, dVar).sendToTarget();
            }
        }

        public final void a() {
            a(d.QUIT);
        }

        public final void a(int i10, int i11) {
            this.f28447f = i10;
            this.f28448g = i11;
            a(d.ORIENTATION_ANGLE_CHANGE);
        }

        public final void a(Runnable runnable) {
            if (this.f28442a == null) {
                return;
            }
            a(d.PAUSE);
            Message.obtain(this.f28442a, runnable).sendToTarget();
        }

        public final void b() {
            a(d.RESUME);
        }

        public final void b(Runnable runnable) {
            if (this.f28442a == null) {
                return;
            }
            a(d.SURFACE_LOST);
            Message.obtain(this.f28442a, runnable).sendToTarget();
        }

        public final void c() {
            a(d.FOCUS_GAINED);
        }

        public final void c(Runnable runnable) {
            Handler handler = this.f28442a;
            if (handler == null) {
                return;
            }
            Message.obtain(handler, runnable).sendToTarget();
            a(d.SURFACE_ACQUIRED);
        }

        public final void d() {
            a(d.FOCUS_LOST);
        }

        public final void d(Runnable runnable) {
            Handler handler = this.f28442a;
            if (handler != null) {
                Message.obtain(handler, runnable).sendToTarget();
            }
        }

        public final void e() {
            a(d.URL_ACTIVATED);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("UnityMain");
            Looper.prepare();
            this.f28442a = new Handler(new Handler.Callback() { // from class: com.unity3d.player.UnityPlayer.e.1
                private void a() {
                    e eVar = e.this;
                    if (eVar.f28445d == b.f28428c && eVar.f28444c) {
                        UnityPlayer.this.nativeFocusChanged(true);
                        e.this.f28445d = b.f28426a;
                    }
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    if (message.what != UnityPlayer.RUN_STATE_CHANGED_MSG_CODE) {
                        return false;
                    }
                    d dVar = (d) message.obj;
                    d dVar2 = d.NEXT_FRAME;
                    if (dVar == dVar2) {
                        e eVar = e.this;
                        eVar.f28446e--;
                        UnityPlayer.this.executeGLThreadJobs();
                        e eVar2 = e.this;
                        if (!eVar2.f28443b || !eVar2.f28444c) {
                            return true;
                        }
                        int i10 = eVar2.f28449h;
                        if (i10 >= 0) {
                            if (i10 == 0 && UnityPlayer.this.getSplashEnabled()) {
                                UnityPlayer.this.DisableStaticSplashScreen();
                            }
                            e.this.f28449h--;
                        }
                        if (!UnityPlayer.this.isFinishing() && !UnityPlayer.this.nativeRender()) {
                            UnityPlayer.this.finish();
                        }
                    } else if (dVar == d.QUIT) {
                        Looper.myLooper().quit();
                    } else if (dVar == d.RESUME) {
                        e.this.f28443b = true;
                    } else if (dVar == d.PAUSE) {
                        e.this.f28443b = false;
                    } else if (dVar == d.SURFACE_LOST) {
                        e.this.f28444c = false;
                    } else {
                        if (dVar == d.SURFACE_ACQUIRED) {
                            e.this.f28444c = true;
                        } else if (dVar == d.FOCUS_LOST) {
                            e eVar3 = e.this;
                            if (eVar3.f28445d == b.f28426a) {
                                UnityPlayer.this.nativeFocusChanged(false);
                            }
                            e.this.f28445d = b.f28427b;
                        } else if (dVar == d.FOCUS_GAINED) {
                            e.this.f28445d = b.f28428c;
                        } else if (dVar == d.URL_ACTIVATED) {
                            UnityPlayer unityPlayer = UnityPlayer.this;
                            unityPlayer.nativeSetLaunchURL(unityPlayer.getLaunchURL());
                        } else if (dVar == d.ORIENTATION_ANGLE_CHANGE) {
                            e eVar4 = e.this;
                            UnityPlayer.this.nativeOrientationChanged(eVar4.f28447f, eVar4.f28448g);
                        }
                        a();
                    }
                    e eVar5 = e.this;
                    if (eVar5.f28443b && eVar5.f28446e <= 0) {
                        Message.obtain(eVar5.f28442a, UnityPlayer.RUN_STATE_CHANGED_MSG_CODE, dVar2).sendToTarget();
                        e.this.f28446e++;
                    }
                    return true;
                }
            });
            Looper.loop();
        }
    }

    /* loaded from: classes4.dex */
    public abstract class f implements Runnable {
        private f() {
        }

        public /* synthetic */ f(UnityPlayer unityPlayer, byte b10) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (UnityPlayer.this.isFinishing()) {
                return;
            }
            a();
        }
    }

    static {
        new i().a();
    }

    public UnityPlayer(Context context) {
        this(context, null);
    }

    public UnityPlayer(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        super(context);
        this.mInitialScreenOrientation = -1;
        this.mMainDisplayOverride = false;
        this.mIsFullscreen = true;
        this.mState = new j();
        this.m_Events = new ConcurrentLinkedQueue();
        this.mKillingIsMyBusiness = null;
        this.mOrientationListener = null;
        this.m_MainThread = new e(this, (byte) 0);
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new c(this, (byte) 0);
        this.m_ARCoreApi = null;
        this.m_FakeListener = new a();
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_launchUri = null;
        this.m_NetworkConnectivity = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.mProcessKillRequested = true;
        this.mSoftInputDialog = null;
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
            this.m_launchUri = currentActivity.getIntent().getData();
        }
        EarlyEnableFullScreenIfVrLaunched(currentActivity);
        this.mContext = context;
        this.mNaturalOrientation = getNaturalOrientation(getResources().getConfiguration().orientation);
        if (currentActivity != null && getSplashEnabled()) {
            h hVar = new h(this.mContext, h.a.a()[getSplashMode()]);
            this.m_SplashScreen = hVar;
            addView(hVar);
        }
        if (currentActivity != null) {
            this.m_PersistentUnitySurface = new com.unity3d.player.f(this.mContext);
        }
        String loadNative = loadNative(getUnityNativeLibraryPath(context));
        if (!j.c()) {
            com.unity3d.player.d.Log(6, "Your hardware does not support this application.");
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.unity3d.player.UnityPlayer.1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    UnityPlayer.this.finish();
                }
            });
            AlertDialog create = positiveButton.setMessage("Your hardware does not support this application.\n\n" + loadNative + "\n\n Press OK to quit.").create();
            create.setCancelable(false);
            create.show();
            return;
        }
        initJni(context);
        this.mState.c(true);
        SurfaceView CreateGlView = CreateGlView();
        this.mGlView = CreateGlView;
        CreateGlView.setContentDescription(GetGlViewContentDescription(context));
        addView(this.mGlView);
        bringChildToFront(this.m_SplashScreen);
        this.mQuitting = false;
        hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_MainThread.start();
    }

    private SurfaceView CreateGlView() {
        SurfaceView surfaceView = new SurfaceView(this.mContext);
        surfaceView.setId(this.mContext.getResources().getIdentifier("unitySurfaceView", TtmlNode.ATTR_ID, this.mContext.getPackageName()));
        if (IsWindowTranslucent()) {
            surfaceView.getHolder().setFormat(-3);
            surfaceView.setZOrderOnTop(true);
        } else {
            surfaceView.getHolder().setFormat(-1);
        }
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.unity3d.player.UnityPlayer.19
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
                UnityPlayer.this.updateGLDisplay(0, surfaceHolder.getSurface());
                UnityPlayer.this.sendSurfaceChangedEvent();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                UnityPlayer.this.updateGLDisplay(0, surfaceHolder.getSurface());
                if (UnityPlayer.this.m_PersistentUnitySurface != null) {
                    UnityPlayer.this.m_PersistentUnitySurface.a(UnityPlayer.this);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (UnityPlayer.this.m_PersistentUnitySurface != null) {
                    UnityPlayer.this.m_PersistentUnitySurface.a(UnityPlayer.this.mGlView);
                }
                UnityPlayer.this.updateGLDisplay(0, null);
            }
        });
        surfaceView.setFocusable(true);
        surfaceView.setFocusableInTouchMode(true);
        return surfaceView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DisableStaticSplashScreen() {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.18
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer unityPlayer = UnityPlayer.this;
                unityPlayer.removeView(unityPlayer.m_SplashScreen);
                UnityPlayer.this.m_SplashScreen = null;
            }
        });
    }

    private void EarlyEnableFullScreenIfVrLaunched(Activity activity) {
        View decorView;
        if (activity == null || !activity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false) || activity.getWindow() == null || (decorView = activity.getWindow().getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(7);
    }

    private String GetGlViewContentDescription(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    private boolean IsWindowTranslucent() {
        Activity activity = currentActivity;
        if (activity == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842840});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        if (j.c()) {
            try {
                nativeUnitySendMessage(str, str2, str3.getBytes(C.UTF8_NAME));
                return;
            } catch (UnsupportedEncodingException unused) {
                return;
            }
        }
        com.unity3d.player.d.Log(5, "Native libraries not loaded - dropping message for " + str + TopicConstant.SEPARATOR + str2);
    }

    private void checkResumePlayer() {
        Activity activity = currentActivity;
        if (this.mState.e(activity != null ? MultiWindowSupport.getAllowResizableWindow(activity) : false)) {
            this.mState.d(true);
            queueGLThreadEvent(new Runnable() { // from class: com.unity3d.player.UnityPlayer.3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeResume();
                    UnityPlayer.this.runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (UnityPlayer.this.m_PersistentUnitySurface != null) {
                                UnityPlayer.this.m_PersistentUnitySurface.b(UnityPlayer.this);
                            }
                        }
                    });
                }
            });
            this.m_MainThread.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        Context context = this.mContext;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return;
        }
        ((Activity) this.mContext).finish();
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }

    private int getNaturalOrientation(int i10) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i10 == 2) {
            return 0;
        }
        return ((rotation == 1 || rotation == 3) && i10 == 1) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private static String getUnityNativeLibraryPath(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    private void hideStatusBar() {
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setFlags(1024, 1024);
        }
    }

    private final native void initJni(Context context);

    private static String loadNative(String str) {
        String str2 = str + "/libmain.so";
        try {
            try {
                try {
                    System.load(str2);
                } catch (UnsatisfiedLinkError unused) {
                    System.loadLibrary("main");
                }
                if (NativeLoader.load(str)) {
                    j.a();
                    return "";
                }
                com.unity3d.player.d.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
                return "NativeLoader.load failure, Unity libraries were not loaded.";
            } catch (UnsatisfiedLinkError e10) {
                return logLoadLibMainError(str2, e10.toString());
            }
        } catch (SecurityException e11) {
            return logLoadLibMainError(str2, e11.toString());
        }
    }

    private static String logLoadLibMainError(String str, String str2) {
        String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        com.unity3d.player.d.Log(6, str3);
        return str3;
    }

    private final native void nativeApplicationUnload();

    private final native boolean nativeDone();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeFocusChanged(boolean z10);

    private final native boolean nativeInjectEvent(InputEvent inputEvent);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeLowMemory();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeMuteMasterAudio(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOrientationChanged(int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i10, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeRender();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    private final native void nativeRestartActivityIndicator();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i10, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetLaunchURL(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private void pauseUnity() {
        reportSoftInputStr(null, 1, true);
        if (this.mState.f()) {
            if (j.c()) {
                final Semaphore semaphore = new Semaphore(0);
                this.m_MainThread.a(isFinishing() ? new Runnable() { // from class: com.unity3d.player.UnityPlayer.23
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnityPlayer.this.shutdown();
                        semaphore.release();
                    }
                } : new Runnable() { // from class: com.unity3d.player.UnityPlayer.24
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!UnityPlayer.this.nativePause()) {
                            semaphore.release();
                            return;
                        }
                        UnityPlayer.this.mQuitting = true;
                        UnityPlayer.this.shutdown();
                        semaphore.release(2);
                    }
                });
                try {
                    if (!semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                        com.unity3d.player.d.Log(5, "Timeout while trying to pause the Unity Engine.");
                    }
                } catch (InterruptedException unused) {
                    com.unity3d.player.d.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
                }
                if (semaphore.drainPermits() > 0) {
                    destroy();
                }
            }
            this.mState.d(false);
            this.mState.b(true);
            if (this.m_AddPhoneCallListener) {
                this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
            }
        }
    }

    private void queueGLThreadEvent(f fVar) {
        if (isFinishing()) {
            return;
        }
        queueGLThreadEvent((Runnable) fVar);
    }

    private void queueGLThreadEvent(Runnable runnable) {
        if (j.c()) {
            if (Thread.currentThread() == this.m_MainThread) {
                runnable.run();
            } else {
                this.m_Events.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSurfaceChangedEvent() {
        if (j.c() && this.mState.e()) {
            this.m_MainThread.d(new Runnable() { // from class: com.unity3d.player.UnityPlayer.20
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeSendSurfaceChangedEvent();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.mProcessKillRequested = nativeDone();
        this.mState.c(false);
    }

    private void swapViews(View view, View view2) {
        boolean z10;
        if (this.mState.d()) {
            z10 = false;
        } else {
            pause();
            z10 = true;
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof UnityPlayer) || ((UnityPlayer) parent) != this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
                bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == this) {
            view2.setVisibility(8);
            removeView(view2);
        }
        if (z10) {
            resume();
        }
    }

    private static void unloadNative() {
        if (j.c()) {
            if (!NativeLoader.unload()) {
                throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            j.b();
        }
    }

    private boolean updateDisplayInternal(final int i10, final Surface surface) {
        if (j.c() && this.mState.e()) {
            final Semaphore semaphore = new Semaphore(0);
            Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.21
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeRecreateGfxState(i10, surface);
                    semaphore.release();
                }
            };
            if (i10 == 0) {
                e eVar = this.m_MainThread;
                if (surface == null) {
                    eVar.b(runnable);
                } else {
                    eVar.c(runnable);
                }
            } else {
                runnable.run();
            }
            if (surface == null && i10 == 0) {
                try {
                    if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                        return true;
                    }
                    com.unity3d.player.d.Log(5, "Timeout while trying detaching primary window.");
                    return true;
                } catch (InterruptedException unused) {
                    com.unity3d.player.d.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateGLDisplay(int i10, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i10, surface);
    }

    public void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    public boolean addViewToPlayer(View view, boolean z10) {
        swapViews(view, z10 ? this.mGlView : null);
        boolean z11 = true;
        boolean z12 = view.getParent() == this;
        boolean z13 = z10 && this.mGlView.getParent() == null;
        boolean z14 = this.mGlView.getParent() == this;
        if (!z12 || (!z13 && !z14)) {
            z11 = false;
        }
        if (!z11) {
            if (!z12) {
                com.unity3d.player.d.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z13 && !z14) {
                com.unity3d.player.d.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z11;
    }

    public void configurationChanged(Configuration configuration) {
        SurfaceView surfaceView = this.mGlView;
        if (surfaceView instanceof SurfaceView) {
            surfaceView.getHolder().setSizeFromLayout();
        }
        l lVar = this.mVideoPlayerProxy;
        if (lVar != null) {
            lVar.c();
        }
    }

    public void destroy() {
        com.unity3d.player.f fVar = this.m_PersistentUnitySurface;
        if (fVar != null) {
            fVar.a();
            this.m_PersistentUnitySurface = null;
        }
        Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.a();
            this.m_Camera2Wrapper = null;
        }
        HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.a();
            this.m_HFPStatus = null;
        }
        NetworkConnectivity networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            networkConnectivity.b();
            this.m_NetworkConnectivity = null;
        }
        this.mQuitting = true;
        if (!this.mState.d()) {
            pause();
        }
        this.m_MainThread.a();
        try {
            this.m_MainThread.join(4000L);
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        BroadcastReceiver broadcastReceiver = this.mKillingIsMyBusiness;
        if (broadcastReceiver != null) {
            this.mContext.unregisterReceiver(broadcastReceiver);
        }
        this.mKillingIsMyBusiness = null;
        if (j.c()) {
            removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
        unloadNative();
    }

    public void disableLogger() {
        com.unity3d.player.d.f28496a = true;
    }

    public boolean displayChanged(int i10, Surface surface) {
        if (i10 == 0) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.22
                @Override // java.lang.Runnable
                public final void run() {
                    if (UnityPlayer.this.mMainDisplayOverride) {
                        UnityPlayer unityPlayer = UnityPlayer.this;
                        unityPlayer.removeView(unityPlayer.mGlView);
                        return;
                    }
                    UnityPlayer unityPlayer2 = UnityPlayer.this;
                    unityPlayer2.addView(unityPlayer2.mGlView);
                }
            });
        }
        return updateDisplayInternal(i10, surface);
    }

    public void executeGLThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.m_Events.poll();
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    public String getClipboardText() {
        ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.mContext).toString() : "";
    }

    public String getKeyboardLayout() {
        g gVar = this.mSoftInputDialog;
        if (gVar == null) {
            return null;
        }
        return gVar.a();
    }

    public String getLaunchURL() {
        Uri uri = this.m_launchUri;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public int getNetworkConnectivity() {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            if (this.m_NetworkConnectivity == null) {
                this.m_NetworkConnectivity = new NetworkConnectivity(this.mContext);
            }
            return this.m_NetworkConnectivity.a();
        }
        return 0;
    }

    public String getNetworkProxySettings(String str) {
        String str2;
        String str3;
        if (!str.startsWith("http:")) {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        str2 = "http.proxyHost";
        str3 = "http.proxyPort";
        String property = System.getProperties().getProperty(str2);
        if (property != null && !"".equals(property)) {
            StringBuilder sb2 = new StringBuilder(property);
            String property2 = System.getProperties().getProperty(str3);
            if (property2 != null && !"".equals(property2)) {
                sb2.append(":");
                sb2.append(property2);
            }
            String property3 = System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !"".equals(property3)) {
                sb2.append('\n');
                sb2.append(property3);
            }
            return sb2.toString();
        }
        return null;
    }

    public Bundle getSettings() {
        return Bundle.EMPTY;
    }

    public int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (Exception unused) {
            return 0;
        }
    }

    public View getView() {
        return this;
    }

    public void hideSoftInput() {
        postOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.5
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.reportSoftInputArea(new Rect());
                UnityPlayer.this.reportSoftInputIsVisible(false);
                g gVar = UnityPlayer.this.mSoftInputDialog;
                if (gVar != null) {
                    gVar.dismiss();
                    UnityPlayer unityPlayer = UnityPlayer.this;
                    unityPlayer.mSoftInputDialog = null;
                    unityPlayer.nativeReportKeyboardConfigChanged();
                }
            }
        });
    }

    public void init(int i10, boolean z10) {
    }

    public boolean initializeGoogleAr() {
        if (this.m_ARCoreApi == null && currentActivity != null && getARCoreEnabled()) {
            GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
            this.m_ARCoreApi = googleARCoreApi;
            googleARCoreApi.initializeARCore(currentActivity);
            if (this.mState.d()) {
                return false;
            }
            this.m_ARCoreApi.resumeARCore();
            return false;
        }
        return false;
    }

    public boolean injectEvent(InputEvent inputEvent) {
        if (j.c()) {
            return nativeInjectEvent(inputEvent);
        }
        return false;
    }

    public boolean isFinishing() {
        if (!this.mQuitting) {
            Context context = this.mContext;
            boolean z10 = (context instanceof Activity) && ((Activity) context).isFinishing();
            this.mQuitting = z10;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public void kill() {
        Process.killProcess(Process.myPid());
    }

    public boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public void lowMemory() {
        if (j.c()) {
            queueGLThreadEvent(new Runnable() { // from class: com.unity3d.player.UnityPlayer.2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeLowMemory();
                }
            });
        }
    }

    public void newIntent(Intent intent) {
        this.m_launchUri = intent.getData();
        this.m_MainThread.e();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i10, int i11, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public void pause() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        l lVar = this.mVideoPlayerProxy;
        if (lVar != null) {
            lVar.a();
        }
        AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            audioVolumeHandler.a();
            this.m_AudioVolumeHandler = null;
        }
        pauseUnity();
    }

    public void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.16
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.pause();
                UnityPlayer.this.windowFocusChanged(false);
                UnityPlayer.this.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
            }
        });
    }

    public void postOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void quit() {
        destroy();
    }

    public void removeViewFromPlayer(View view) {
        swapViews(this.mGlView, view);
        boolean z10 = true;
        boolean z11 = view.getParent() == null;
        boolean z12 = this.mGlView.getParent() == this;
        if (!z11 || !z12) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        if (!z11) {
            com.unity3d.player.d.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
        }
        if (z12) {
            return;
        }
        com.unity3d.player.d.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
    }

    public void reportError(String str, String str2) {
        com.unity3d.player.d.Log(6, str + ": " + str2);
    }

    public void reportSoftInputArea(final Rect rect) {
        queueGLThreadEvent(new f() { // from class: com.unity3d.player.UnityPlayer.12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                UnityPlayer unityPlayer = UnityPlayer.this;
                Rect rect2 = rect;
                unityPlayer.nativeSetInputArea(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        });
    }

    public void reportSoftInputIsVisible(final boolean z10) {
        queueGLThreadEvent(new f() { // from class: com.unity3d.player.UnityPlayer.13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                UnityPlayer.this.nativeSetKeyboardIsVisible(z10);
            }
        });
    }

    public void reportSoftInputSelection(final int i10, final int i11) {
        queueGLThreadEvent(new f() { // from class: com.unity3d.player.UnityPlayer.11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                UnityPlayer.this.nativeSetInputSelection(i10, i11);
            }
        });
    }

    public void reportSoftInputStr(final String str, final int i10, final boolean z10) {
        if (i10 == 1) {
            hideSoftInput();
        }
        queueGLThreadEvent(new f() { // from class: com.unity3d.player.UnityPlayer.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                if (z10) {
                    UnityPlayer.this.nativeSoftInputCanceled();
                } else {
                    String str2 = str;
                    if (str2 != null) {
                        UnityPlayer.this.nativeSetInputString(str2);
                    }
                }
                if (i10 == 1) {
                    UnityPlayer.this.nativeSoftInputClosed();
                }
            }
        });
    }

    public void requestUserAuthorization(String str) {
        Activity activity;
        if (str == null || str.isEmpty() || (activity = currentActivity) == null) {
            return;
        }
        UnityPermissions.requestUserPermissions(activity, new String[]{str}, null);
    }

    public void resume() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.b(false);
        l lVar = this.mVideoPlayerProxy;
        if (lVar != null) {
            lVar.b();
        }
        checkResumePlayer();
        if (j.c()) {
            nativeRestartActivityIndicator();
        }
        this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
    }

    public void runOnAnonymousThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void runOnUiThread(Runnable runnable) {
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            com.unity3d.player.d.Log(5, "Not running Unity from an Activity; ignored...");
        }
    }

    public void setCharacterLimit(final int i10) {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.7
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = UnityPlayer.this.mSoftInputDialog;
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        });
    }

    public void setClipboardText(String str) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    public void setHideInputField(final boolean z10) {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.8
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = UnityPlayer.this.mSoftInputDialog;
                if (gVar != null) {
                    gVar.a(z10);
                }
            }
        });
    }

    public void setSelection(final int i10, final int i11) {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.9
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = UnityPlayer.this.mSoftInputDialog;
                if (gVar != null) {
                    gVar.a(i10, i11);
                }
            }
        });
    }

    public void setSoftInputStr(final String str) {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.6
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                g gVar = UnityPlayer.this.mSoftInputDialog;
                if (gVar == null || (str2 = str) == null) {
                    return;
                }
                gVar.a(str2);
            }
        });
    }

    public void showSoftInput(final String str, final int i10, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final String str2, final int i11, final boolean z14) {
        postOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.4
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.mSoftInputDialog = new g(UnityPlayer.this.mContext, this, str, i10, z10, z11, z12, str2, i11, z14);
                UnityPlayer.this.mSoftInputDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.unity3d.player.UnityPlayer.4.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        UnityPlayer.this.nativeSoftInputLostFocus();
                        UnityPlayer.this.reportSoftInputStr(null, 1, false);
                    }
                });
                UnityPlayer.this.mSoftInputDialog.show();
                UnityPlayer.this.nativeReportKeyboardConfigChanged();
            }
        });
    }

    public boolean showVideoPlayer(String str, int i10, int i11, int i12, boolean z10, int i13, int i14) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new l(this);
        }
        boolean a10 = this.mVideoPlayerProxy.a(this.mContext, str, i10, i11, i12, z10, i13, i14, new l.a() { // from class: com.unity3d.player.UnityPlayer.14
            @Override // com.unity3d.player.l.a
            public final void a() {
                UnityPlayer.this.mVideoPlayerProxy = null;
            }
        });
        if (a10) {
            runOnUiThread(new Runnable() { // from class: com.unity3d.player.UnityPlayer.15
                @Override // java.lang.Runnable
                public final void run() {
                    if (UnityPlayer.this.nativeIsAutorotationOn() && (UnityPlayer.this.mContext instanceof Activity)) {
                        ((Activity) UnityPlayer.this.mContext).setRequestedOrientation(UnityPlayer.this.mInitialScreenOrientation);
                    }
                }
            });
        }
        return a10;
    }

    public boolean skipPermissionsDialog() {
        Activity activity = currentActivity;
        if (activity != null) {
            return UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    public boolean startOrientationListener(int i10) {
        String str;
        if (this.mOrientationListener != null) {
            str = "Orientation Listener already started.";
        } else {
            OrientationEventListener orientationEventListener = new OrientationEventListener(this.mContext, i10) { // from class: com.unity3d.player.UnityPlayer.17
                @Override // android.view.OrientationEventListener
                public final void onOrientationChanged(int i11) {
                    UnityPlayer unityPlayer = UnityPlayer.this;
                    unityPlayer.m_MainThread.a(unityPlayer.mNaturalOrientation, i11);
                }
            };
            this.mOrientationListener = orientationEventListener;
            if (orientationEventListener.canDetectOrientation()) {
                this.mOrientationListener.enable();
                return true;
            }
            str = "Orientation Listener cannot detect orientation.";
        }
        com.unity3d.player.d.Log(5, str);
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            com.unity3d.player.d.Log(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    public void toggleGyroscopeSensor(boolean z10) {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z10) {
            sensorManager.registerListener(this.m_FakeListener, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.m_FakeListener);
        }
    }

    public void unload() {
        nativeApplicationUnload();
    }

    public void windowFocusChanged(boolean z10) {
        this.mState.a(z10);
        if (this.mState.e()) {
            if (z10) {
                this.m_MainThread.c();
            } else {
                this.m_MainThread.d();
            }
            checkResumePlayer();
        }
    }
}
