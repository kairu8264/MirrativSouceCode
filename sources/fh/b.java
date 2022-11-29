package fh;

import ai.cw;
import ai.jd0;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import rg.f;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final cw f31980a;

    public b(cw cwVar) {
        this.f31980a = cwVar;
    }

    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull rg.b bVar, f fVar, @RecentlyNonNull c cVar) {
        new jd0(context, bVar, fVar == null ? null : fVar.a()).b(cVar);
    }

    @RecentlyNonNull
    public String b() {
        return this.f31980a.a();
    }
}
