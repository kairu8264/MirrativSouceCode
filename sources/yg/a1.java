package yg;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Bitmap> f61853a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f61854b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return this.f61853a.get(num);
    }
}
