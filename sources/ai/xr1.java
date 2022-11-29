package ai;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes3.dex */
public final class xr1 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f12083a;

    /* renamed from: b  reason: collision with root package name */
    public final Sensor f12084b;

    /* renamed from: c  reason: collision with root package name */
    public float f12085c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public Float f12086d = Float.valueOf(0.0f);

    /* renamed from: e  reason: collision with root package name */
    public long f12087e = wg.t.k().currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    public int f12088f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12089g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12090h = false;

    /* renamed from: i  reason: collision with root package name */
    public wr1 f12091i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12092j = false;

    public xr1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f12083a = sensorManager;
        if (sensorManager != null) {
            this.f12084b = sensorManager.getDefaultSensor(4);
        } else {
            this.f12084b = null;
        }
    }

    public final void a(wr1 wr1Var) {
        this.f12091i = wr1Var;
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) ft.c().c(ox.f8139y6)).booleanValue()) {
                if (!this.f12092j && (sensorManager = this.f12083a) != null && (sensor = this.f12084b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f12092j = true;
                    yg.p1.k("Listening for flick gestures.");
                }
                if (this.f12083a == null || this.f12084b == null) {
                    uj0.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.f12092j && (sensorManager = this.f12083a) != null && (sensor = this.f12084b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.f12092j = false;
                yg.p1.k("Stopped listening for flick gestures.");
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) ft.c().c(ox.f8139y6)).booleanValue()) {
            long currentTimeMillis = wg.t.k().currentTimeMillis();
            if (this.f12087e + ((Integer) ft.c().c(ox.A6)).intValue() < currentTimeMillis) {
                this.f12088f = 0;
                this.f12087e = currentTimeMillis;
                this.f12089g = false;
                this.f12090h = false;
                this.f12085c = this.f12086d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f12086d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f12086d = valueOf;
            float floatValue = valueOf.floatValue();
            float f10 = this.f12085c;
            gx<Float> gxVar = ox.f8147z6;
            if (floatValue > f10 + ((Float) ft.c().c(gxVar)).floatValue()) {
                this.f12085c = this.f12086d.floatValue();
                this.f12090h = true;
            } else if (this.f12086d.floatValue() < this.f12085c - ((Float) ft.c().c(gxVar)).floatValue()) {
                this.f12085c = this.f12086d.floatValue();
                this.f12089g = true;
            }
            if (this.f12086d.isInfinite()) {
                this.f12086d = Float.valueOf(0.0f);
                this.f12085c = 0.0f;
            }
            if (this.f12089g && this.f12090h) {
                yg.p1.k("Flick detected.");
                this.f12087e = currentTimeMillis;
                int i10 = this.f12088f + 1;
                this.f12088f = i10;
                this.f12089g = false;
                this.f12090h = false;
                wr1 wr1Var = this.f12091i;
                if (wr1Var != null) {
                    if (i10 == ((Integer) ft.c().c(ox.B6)).intValue()) {
                        ms1 ms1Var = (ms1) wr1Var;
                        ms1Var.k(new ks1(ms1Var), ls1.GESTURE);
                    }
                }
            }
        }
    }
}
