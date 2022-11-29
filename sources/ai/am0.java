package ai;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* loaded from: classes3.dex */
public final class am0 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f1920a;

    /* renamed from: c  reason: collision with root package name */
    public final Display f1922c;

    /* renamed from: f  reason: collision with root package name */
    public float[] f1925f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f1926g;

    /* renamed from: h  reason: collision with root package name */
    public zl0 f1927h;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f1923d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    public final float[] f1924e = new float[9];

    /* renamed from: b  reason: collision with root package name */
    public final Object f1921b = new Object();

    public am0(Context context) {
        this.f1920a = (SensorManager) context.getSystemService("sensor");
        this.f1922c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a() {
        if (this.f1926g != null) {
            return;
        }
        Sensor defaultSensor = this.f1920a.getDefaultSensor(11);
        if (defaultSensor == null) {
            uj0.c("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        ow2 ow2Var = new ow2(handlerThread.getLooper());
        this.f1926g = ow2Var;
        if (this.f1920a.registerListener(this, defaultSensor, 0, ow2Var)) {
            return;
        }
        uj0.c("SensorManager.registerListener failed.");
        b();
    }

    public final void b() {
        if (this.f1926g == null) {
            return;
        }
        this.f1920a.unregisterListener(this);
        this.f1926g.post(new yl0(this));
        this.f1926g = null;
    }

    public final void c(zl0 zl0Var) {
        this.f1927h = zl0Var;
    }

    public final boolean d(float[] fArr) {
        synchronized (this.f1921b) {
            float[] fArr2 = this.f1925f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f1921b) {
            if (this.f1925f == null) {
                this.f1925f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f1923d, fArr);
        int rotation = this.f1922c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f1923d, 2, TsExtractor.TS_STREAM_TYPE_AC3, this.f1924e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f1923d, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, this.f1924e);
        } else if (rotation != 3) {
            System.arraycopy(this.f1923d, 0, this.f1924e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f1923d, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 1, this.f1924e);
        }
        float[] fArr2 = this.f1924e;
        float f10 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f10;
        float f11 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f11;
        float f12 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f12;
        synchronized (this.f1921b) {
            System.arraycopy(this.f1924e, 0, this.f1925f, 0, 9);
        }
        zl0 zl0Var = this.f1927h;
        if (zl0Var != null) {
            zl0Var.zza();
        }
    }
}
