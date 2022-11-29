package de;

import android.graphics.PointF;
import jo.p;

/* loaded from: classes2.dex */
public final class j {
    public static final PointF a(PointF pointF, int i10) {
        p.h(pointF, "<this>");
        float f10 = i10;
        return new PointF(pointF.x / f10, pointF.y / f10);
    }

    public static final PointF b(PointF pointF, PointF pointF2) {
        p.h(pointF, "<this>");
        p.h(pointF2, "other");
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    public static final PointF c(PointF pointF, PointF pointF2) {
        p.h(pointF, "<this>");
        p.h(pointF2, "other");
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
}
