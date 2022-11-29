package h6;

import android.graphics.Bitmap;
import h6.c;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final i f34530a;

    public a(i iVar) {
        this.f34530a = iVar;
    }

    @Override // h6.h
    public void a(int i10) {
    }

    @Override // h6.h
    public c.C0436c b(c.b bVar) {
        return null;
    }

    @Override // h6.h
    public void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f34530a.c(bVar, bitmap, map, o6.a.a(bitmap));
    }
}
