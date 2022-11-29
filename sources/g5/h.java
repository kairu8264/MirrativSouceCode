package g5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes.dex */
public class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    public final Property<T, PointF> f32704a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f32705b;

    /* renamed from: c  reason: collision with root package name */
    public final float f32706c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f32707d;

    /* renamed from: e  reason: collision with root package name */
    public final PointF f32708e;

    /* renamed from: f  reason: collision with root package name */
    public float f32709f;

    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f32707d = new float[2];
        this.f32708e = new PointF();
        this.f32704a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f32705b = pathMeasure;
        this.f32706c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t10) {
        return Float.valueOf(this.f32709f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t10, Float f10) {
        this.f32709f = f10.floatValue();
        this.f32705b.getPosTan(this.f32706c * f10.floatValue(), this.f32707d, null);
        PointF pointF = this.f32708e;
        float[] fArr = this.f32707d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f32704a.set(t10, pointF);
    }
}
