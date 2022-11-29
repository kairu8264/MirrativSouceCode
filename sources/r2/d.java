package r2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public a f49711a;

    /* renamed from: b  reason: collision with root package name */
    public String f49712b;

    /* renamed from: c  reason: collision with root package name */
    public int f49713c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f49714d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f49715e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b> f49716f = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f49717a;

        /* renamed from: b  reason: collision with root package name */
        public float f49718b;
    }

    public float a(float f10) {
        return (float) this.f49711a.a(f10);
    }

    public String toString() {
        String str = this.f49712b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f49716f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + "[" + next.f49717a + " , " + decimalFormat.format(next.f49718b) + "] ";
        }
        return str;
    }
}
