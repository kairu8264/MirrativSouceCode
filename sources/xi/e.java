package xi;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class e extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f60304b = new e();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f60305a;

    public e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f60305a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f60305a.containsKey(drawable)) {
            return this.f60305a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f60305a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
