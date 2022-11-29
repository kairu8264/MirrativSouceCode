package y6;

import a7.o;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f61263a;

    /* renamed from: b  reason: collision with root package name */
    public final char f61264b;

    /* renamed from: c  reason: collision with root package name */
    public final double f61265c;

    /* renamed from: d  reason: collision with root package name */
    public final double f61266d;

    /* renamed from: e  reason: collision with root package name */
    public final String f61267e;

    /* renamed from: f  reason: collision with root package name */
    public final String f61268f;

    public d(List<o> list, char c10, double d10, double d11, String str, String str2) {
        this.f61263a = list;
        this.f61264b = c10;
        this.f61265c = d10;
        this.f61266d = d11;
        this.f61267e = str;
        this.f61268f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return ((((0 + c10) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<o> a() {
        return this.f61263a;
    }

    public double b() {
        return this.f61266d;
    }

    public int hashCode() {
        return c(this.f61264b, this.f61268f, this.f61267e);
    }
}
