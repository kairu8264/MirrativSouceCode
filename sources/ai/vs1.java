package ai;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes3.dex */
public final class vs1 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11279a;

    /* renamed from: b  reason: collision with root package name */
    public SensorManager f11280b;

    /* renamed from: c  reason: collision with root package name */
    public Sensor f11281c;

    /* renamed from: d  reason: collision with root package name */
    public long f11282d;

    /* renamed from: e  reason: collision with root package name */
    public int f11283e;

    /* renamed from: f  reason: collision with root package name */
    public us1 f11284f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11285g;

    public vs1(Context context) {
        this.f11279a = context;
    }

    public final void a(us1 us1Var) {
        this.f11284f = us1Var;
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) ft.c().c(ox.f8099t6)).booleanValue()) {
                if (this.f11280b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f11279a.getSystemService("sensor");
                    this.f11280b = sensorManager2;
                    if (sensorManager2 == null) {
                        uj0.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f11281c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f11285g && (sensorManager = this.f11280b) != null && (sensor = this.f11281c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f11282d = wg.t.k().currentTimeMillis() - ((Integer) ft.c().c(ox.f8115v6)).intValue();
                    this.f11285g = true;
                    yg.p1.k("Listening for shake gestures.");
                }
            }
        }
    }

    public final void c() {
        synchronized (this) {
            if (this.f11285g) {
                SensorManager sensorManager = this.f11280b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f11281c);
                    yg.p1.k("Stopped listening for shake gestures.");
                }
                this.f11285g = false;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) ft.c().c(ox.f8099t6)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) < ((Float) ft.c().c(ox.f8107u6)).floatValue()) {
                return;
            }
            long currentTimeMillis = wg.t.k().currentTimeMillis();
            if (this.f11282d + ((Integer) ft.c().c(ox.f8115v6)).intValue() > currentTimeMillis) {
                return;
            }
            if (this.f11282d + ((Integer) ft.c().c(ox.f8123w6)).intValue() < currentTimeMillis) {
                this.f11283e = 0;
            }
            yg.p1.k("Shake detected.");
            this.f11282d = currentTimeMillis;
            int i10 = this.f11283e + 1;
            this.f11283e = i10;
            us1 us1Var = this.f11284f;
            if (us1Var != null) {
                if (i10 == ((Integer) ft.c().c(ox.f8131x6)).intValue()) {
                    ms1 ms1Var = (ms1) us1Var;
                    ms1Var.k(new is1(ms1Var), ls1.GESTURE);
                }
            }
        }
    }
}
