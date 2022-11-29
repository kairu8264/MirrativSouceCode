package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static CameraManager f28461b;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f28462c;

    /* renamed from: e  reason: collision with root package name */
    private static Semaphore f28463e = new Semaphore(1);

    /* renamed from: a  reason: collision with root package name */
    private c f28464a;

    /* renamed from: d  reason: collision with root package name */
    private CameraDevice f28465d;

    /* renamed from: f  reason: collision with root package name */
    private HandlerThread f28466f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f28467g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f28468h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f28469i;

    /* renamed from: j  reason: collision with root package name */
    private int f28470j;

    /* renamed from: k  reason: collision with root package name */
    private int f28471k;

    /* renamed from: n  reason: collision with root package name */
    private int f28474n;

    /* renamed from: o  reason: collision with root package name */
    private int f28475o;

    /* renamed from: q  reason: collision with root package name */
    private Range f28477q;

    /* renamed from: s  reason: collision with root package name */
    private Image f28479s;

    /* renamed from: t  reason: collision with root package name */
    private CaptureRequest.Builder f28480t;

    /* renamed from: w  reason: collision with root package name */
    private int f28483w;

    /* renamed from: x  reason: collision with root package name */
    private SurfaceTexture f28484x;

    /* renamed from: l  reason: collision with root package name */
    private float f28472l = -1.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f28473m = -1.0f;

    /* renamed from: p  reason: collision with root package name */
    private boolean f28476p = false;

    /* renamed from: r  reason: collision with root package name */
    private ImageReader f28478r = null;

    /* renamed from: u  reason: collision with root package name */
    private CameraCaptureSession f28481u = null;

    /* renamed from: v  reason: collision with root package name */
    private Object f28482v = new Object();

    /* renamed from: y  reason: collision with root package name */
    private Surface f28485y = null;

    /* renamed from: z  reason: collision with root package name */
    private int f28486z = a.f28494c;
    private CameraCaptureSession.CaptureCallback A = new CameraCaptureSession.CaptureCallback() { // from class: com.unity3d.player.b.1
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b.this.a(captureRequest.getTag());
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            d.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
            b.this.a(captureRequest.getTag());
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        }
    };
    private final CameraDevice.StateCallback B = new CameraDevice.StateCallback() { // from class: com.unity3d.player.b.3
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            b.f28463e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            d.Log(5, "Camera2: CameraDevice disconnected.");
            b.this.a(cameraDevice);
            b.f28463e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i10) {
            d.Log(6, "Camera2: Error opeining CameraDevice " + i10);
            b.this.a(cameraDevice);
            b.f28463e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            b.this.f28465d = cameraDevice;
            b.f28463e.release();
        }
    };
    private final ImageReader.OnImageAvailableListener C = new ImageReader.OnImageAvailableListener() { // from class: com.unity3d.player.b.4
        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            if (b.f28463e.tryAcquire()) {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                        b.this.f28464a.a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                    } else {
                        d.Log(6, "Camera2: Wrong image format.");
                    }
                    if (b.this.f28479s != null) {
                        b.this.f28479s.close();
                    }
                    b.this.f28479s = acquireNextImage;
                }
                b.f28463e.release();
            }
        }
    };
    private final SurfaceTexture.OnFrameAvailableListener D = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.unity3d.player.b.5
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            b.this.f28464a.a(surfaceTexture);
        }
    };

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f28492a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f28493b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f28494c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ int[] f28495d = {1, 2, 3};
    }

    public b(c cVar) {
        this.f28464a = null;
        this.f28464a = cVar;
        g();
    }

    public static int a(Context context) {
        return c(context).length;
    }

    public static int a(Context context, int i10) {
        try {
            return ((Integer) b(context).getCameraCharacteristics(c(context)[i10]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
            return 0;
        }
    }

    private static int a(Range[] rangeArr, int i10) {
        int i11 = -1;
        double d10 = Double.MAX_VALUE;
        for (int i12 = 0; i12 < rangeArr.length; i12++) {
            int intValue = ((Integer) rangeArr[i12].getLower()).intValue();
            int intValue2 = ((Integer) rangeArr[i12].getUpper()).intValue();
            float f10 = i10;
            if (f10 + 0.1f > intValue && f10 - 0.1f < intValue2) {
                return i10;
            }
            if (r4 < d10) {
                i11 = i12;
                d10 = r4;
            }
        }
        return ((Integer) (i10 > ((Integer) rangeArr[i11].getUpper()).intValue() ? rangeArr[i11].getUpper() : rangeArr[i11].getLower())).intValue();
    }

    private static Rect a(Size[] sizeArr, double d10, double d11) {
        double d12 = Double.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < sizeArr.length; i12++) {
            int width = sizeArr[i12].getWidth();
            int height = sizeArr[i12].getHeight();
            double abs = Math.abs(Math.log(d10 / width)) + Math.abs(Math.log(d11 / height));
            if (abs < d12) {
                i10 = width;
                i11 = height;
                d12 = abs;
            }
        }
        return new Rect(0, 0, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CameraDevice cameraDevice) {
        synchronized (this.f28482v) {
            this.f28481u = null;
        }
        cameraDevice.close();
        this.f28465d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj != "Focus") {
            if (obj == "Cancel focus") {
                synchronized (this.f28482v) {
                    if (this.f28481u != null) {
                        j();
                    }
                }
                return;
            }
            return;
        }
        this.f28476p = false;
        synchronized (this.f28482v) {
            if (this.f28481u != null) {
                try {
                    this.f28480t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.f28480t.setTag("Regular");
                    this.f28481u.setRepeatingRequest(this.f28480t.build(), this.A, this.f28467g);
                } catch (CameraAccessException e10) {
                    d.Log(6, "Camera2: CameraAccessException " + e10);
                }
            }
        }
    }

    private static Size[] a(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            d.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return outputSizes;
    }

    private static CameraManager b(Context context) {
        if (f28461b == null) {
            f28461b = (CameraManager) context.getSystemService("camera");
        }
        return f28461b;
    }

    private void b(CameraCharacteristics cameraCharacteristics) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
        this.f28471k = intValue;
        if (intValue > 0) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.f28469i = rect;
            float width = rect.width() / this.f28469i.height();
            float width2 = this.f28468h.width() / this.f28468h.height();
            if (width2 > width) {
                this.f28474n = 0;
                this.f28475o = (int) ((this.f28469i.height() - (this.f28469i.width() / width2)) / 2.0f);
            } else {
                this.f28475o = 0;
                this.f28474n = (int) ((this.f28469i.width() - (this.f28469i.height() * width2)) / 2.0f);
            }
            this.f28470j = Math.min(this.f28469i.width(), this.f28469i.height()) / 20;
        }
    }

    public static boolean b(Context context, int i10) {
        try {
            return ((Integer) b(context).getCameraCharacteristics(c(context)[i10]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
            return false;
        }
    }

    public static boolean c(Context context, int i10) {
        try {
            return ((Integer) b(context).getCameraCharacteristics(c(context)[i10]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
            return false;
        }
    }

    private static String[] c(Context context) {
        if (f28462c == null) {
            try {
                f28462c = b(context).getCameraIdList();
            } catch (CameraAccessException e10) {
                d.Log(6, "Camera2: CameraAccessException " + e10);
                f28462c = new String[0];
            }
        }
        return f28462c;
    }

    public static int d(Context context, int i10) {
        try {
            CameraCharacteristics cameraCharacteristics = b(context).getCameraCharacteristics(c(context)[i10]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
        }
        return 0;
    }

    public static int[] e(Context context, int i10) {
        try {
            Size[] a10 = a(b(context).getCameraCharacteristics(c(context)[i10]));
            if (a10 != null) {
                int[] iArr = new int[a10.length * 2];
                for (int i11 = 0; i11 < a10.length; i11++) {
                    int i12 = i11 * 2;
                    iArr[i12] = a10[i11].getWidth();
                    iArr[i12 + 1] = a10[i11].getHeight();
                }
                return iArr;
            }
            return null;
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
            return null;
        }
    }

    private void g() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f28466f = handlerThread;
        handlerThread.start();
        this.f28467g = new Handler(this.f28466f.getLooper());
    }

    private void h() {
        this.f28466f.quit();
        try {
            this.f28466f.join(4000L);
            this.f28466f = null;
            this.f28467g = null;
        } catch (InterruptedException e10) {
            this.f28466f.interrupt();
            d.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e10);
        }
    }

    private void i() {
        try {
            Semaphore semaphore = f28463e;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!semaphore.tryAcquire(4L, timeUnit)) {
                d.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f28465d.close();
            try {
                if (!f28463e.tryAcquire(4L, timeUnit)) {
                    d.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e10) {
                d.Log(6, "Camera2: Interrupted while waiting to close camera " + e10);
            }
            this.f28465d = null;
            f28463e.release();
        } catch (InterruptedException e11) {
            d.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            if (this.f28471k != 0) {
                float f10 = this.f28472l;
                if (f10 >= 0.0f && f10 <= 1.0f) {
                    float f11 = this.f28473m;
                    if (f11 >= 0.0f && f11 <= 1.0f) {
                        this.f28476p = true;
                        int width = this.f28469i.width();
                        int i10 = this.f28474n;
                        int height = this.f28469i.height();
                        int i11 = this.f28475o;
                        int i12 = (int) (((height - (i11 * 2)) * (1.0d - this.f28473m)) + i11);
                        int max = Math.max(this.f28470j + 1, Math.min((int) (((width - (i10 * 2)) * this.f28472l) + i10), (this.f28469i.width() - this.f28470j) - 1));
                        int max2 = Math.max(this.f28470j + 1, Math.min(i12, (this.f28469i.height() - this.f28470j) - 1));
                        CaptureRequest.Builder builder = this.f28480t;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i13 = this.f28470j;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(max - i13, max2 - i13, i13 * 2, i13 * 2, 999)});
                        this.f28480t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f28480t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f28480t.setTag("Focus");
                        this.f28481u.capture(this.f28480t.build(), this.A, this.f28467g);
                        return;
                    }
                }
            }
            this.f28480t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f28480t.setTag("Regular");
            CameraCaptureSession cameraCaptureSession = this.f28481u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(this.f28480t.build(), this.A, this.f28467g);
            }
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
        }
    }

    private void k() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f28481u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.f28480t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f28480t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f28480t.setTag("Cancel focus");
                this.f28481u.capture(this.f28480t.build(), this.A, this.f28467g);
            }
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
        }
    }

    public final Rect a() {
        return this.f28468h;
    }

    public final boolean a(float f10, float f11) {
        if (this.f28471k > 0) {
            if (this.f28476p) {
                d.Log(5, "Camera2: Setting manual focus point already started.");
                return false;
            }
            this.f28472l = f10;
            this.f28473m = f11;
            synchronized (this.f28482v) {
                if (this.f28481u != null && this.f28486z != a.f28493b) {
                    k();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean a(Context context, int i10, int i11, int i12, int i13, int i14) {
        try {
            CameraCharacteristics cameraCharacteristics = f28461b.getCameraCharacteristics(c(context)[i10]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                d.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] a10 = a(cameraCharacteristics);
            if (a10 != null && a10.length != 0) {
                this.f28468h = a(a10, i11, i12);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null && rangeArr.length != 0) {
                    int a11 = a(rangeArr, i13);
                    this.f28477q = new Range(Integer.valueOf(a11), Integer.valueOf(a11));
                    try {
                        Semaphore semaphore = f28463e;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        if (!semaphore.tryAcquire(4L, timeUnit)) {
                            d.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                            return false;
                        }
                        try {
                            f28461b.openCamera(c(context)[i10], this.B, this.f28467g);
                            try {
                            } catch (InterruptedException e10) {
                                d.Log(6, "Camera2: Interrupted while waiting to open camera " + e10);
                            }
                            if (!f28463e.tryAcquire(4L, timeUnit)) {
                                d.Log(5, "Camera2: Timeout waiting to open camera.");
                                return false;
                            }
                            f28463e.release();
                            this.f28483w = i14;
                            b(cameraCharacteristics);
                            return this.f28465d != null;
                        } catch (CameraAccessException e11) {
                            d.Log(6, "Camera2: CameraAccessException " + e11);
                            f28463e.release();
                            return false;
                        }
                    } catch (InterruptedException e12) {
                        d.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e12);
                        return false;
                    }
                }
                d.Log(6, "Camera2: target FPS ranges are not avialable.");
            }
            return false;
        } catch (CameraAccessException e13) {
            d.Log(6, "Camera2: CameraAccessException " + e13);
            return false;
        }
    }

    public final void b() {
        if (this.f28465d != null) {
            e();
            i();
            this.A = null;
            this.f28485y = null;
            this.f28484x = null;
            Image image = this.f28479s;
            if (image != null) {
                image.close();
                this.f28479s = null;
            }
            ImageReader imageReader = this.f28478r;
            if (imageReader != null) {
                imageReader.close();
                this.f28478r = null;
            }
        }
        h();
    }

    public final void c() {
        if (this.f28478r == null) {
            ImageReader newInstance = ImageReader.newInstance(this.f28468h.width(), this.f28468h.height(), 35, 2);
            this.f28478r = newInstance;
            newInstance.setOnImageAvailableListener(this.C, this.f28467g);
            this.f28479s = null;
            if (this.f28483w != 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28483w);
                this.f28484x = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f28468h.width(), this.f28468h.height());
                this.f28484x.setOnFrameAvailableListener(this.D, this.f28467g);
                this.f28485y = new Surface(this.f28484x);
            }
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.f28481u;
            if (cameraCaptureSession == null) {
                CameraDevice cameraDevice = this.f28465d;
                Surface surface = this.f28485y;
                cameraDevice.createCaptureSession(surface != null ? Arrays.asList(surface, this.f28478r.getSurface()) : Arrays.asList(this.f28478r.getSurface()), new CameraCaptureSession.StateCallback() { // from class: com.unity3d.player.b.2
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession2) {
                        d.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession2) {
                        if (b.this.f28465d == null) {
                            return;
                        }
                        synchronized (b.this.f28482v) {
                            b.this.f28481u = cameraCaptureSession2;
                            try {
                                b bVar = b.this;
                                bVar.f28480t = bVar.f28465d.createCaptureRequest(1);
                                if (b.this.f28485y != null) {
                                    b.this.f28480t.addTarget(b.this.f28485y);
                                }
                                b.this.f28480t.addTarget(b.this.f28478r.getSurface());
                                b.this.f28480t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, b.this.f28477q);
                                b.this.j();
                            } catch (CameraAccessException e10) {
                                d.Log(6, "Camera2: CameraAccessException " + e10);
                            }
                        }
                    }
                }, this.f28467g);
            } else if (this.f28486z == a.f28493b) {
                cameraCaptureSession.setRepeatingRequest(this.f28480t.build(), this.A, this.f28467g);
            }
            this.f28486z = a.f28492a;
        } catch (CameraAccessException e10) {
            d.Log(6, "Camera2: CameraAccessException " + e10);
        }
    }

    public final void d() {
        synchronized (this.f28482v) {
            CameraCaptureSession cameraCaptureSession = this.f28481u;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.f28486z = a.f28493b;
                } catch (CameraAccessException e10) {
                    d.Log(6, "Camera2: CameraAccessException " + e10);
                }
            }
        }
    }

    public final void e() {
        synchronized (this.f28482v) {
            CameraCaptureSession cameraCaptureSession = this.f28481u;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e10) {
                    d.Log(6, "Camera2: CameraAccessException " + e10);
                }
                this.f28481u.close();
                this.f28481u = null;
                this.f28486z = a.f28494c;
            }
        }
    }
}
