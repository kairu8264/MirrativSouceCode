package ai;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class z0 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final Activity f12782i;

    /* renamed from: j  reason: collision with root package name */
    public final View f12783j;

    public z0(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, View view, Activity activity) {
        super(r0Var, "h8EVC95dwYnFQkP2MhkDIC/tXo0ux4wCcOlQmWH2MzSwaPfcZ/24kCQO32wp6PV0", "0H2C2EeQe84lGZgr+dAw2Fmmx+KWvzkBWNdP/wQOLp8=", c64Var, i10, 62);
        this.f12783j = view;
        this.f12782i = activity;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f12783j == null) {
            return;
        }
        boolean booleanValue = ((Boolean) ft.c().c(ox.J1)).booleanValue();
        Object[] objArr = (Object[]) this.f1689f.invoke(null, this.f12783j, this.f12782i, Boolean.valueOf(booleanValue));
        synchronized (this.f1688e) {
            this.f1688e.G(((Long) objArr[0]).longValue());
            this.f1688e.H(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.f1688e.I((String) objArr[2]);
            }
        }
    }
}
