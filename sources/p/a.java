package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f45616a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f45617b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f45618c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f45619d;

    /* renamed from: p.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0689a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f45620a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f45621b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f45622c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f45623d;

        public a a() {
            return new a(this.f45620a, this.f45621b, this.f45622c, this.f45623d);
        }
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f45616a = num;
        this.f45617b = num2;
        this.f45618c = num3;
        this.f45619d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f45616a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f45617b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f45618c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f45619d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
