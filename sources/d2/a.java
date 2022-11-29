package d2;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public abstract class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final int f29054a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0269a f29055b;

    /* renamed from: d2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0269a {
        Object a(Context context, a aVar, ao.d<? super Typeface> dVar);

        Typeface b(Context context, a aVar);
    }

    @Override // d2.k
    public final int a() {
        return this.f29054a;
    }

    public final InterfaceC0269a d() {
        return this.f29055b;
    }
}
