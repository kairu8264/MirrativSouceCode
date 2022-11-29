package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
public final class e implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0239a interfaceC0239a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.f27245a = interfaceC0239a.a(context, str);
        int b10 = interfaceC0239a.b(context, str, true);
        bVar.f27246b = b10;
        int i10 = bVar.f27245a;
        if (i10 == 0) {
            if (b10 == 0) {
                bVar.f27247c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (i10 >= b10) {
            bVar.f27247c = -1;
        } else {
            bVar.f27247c = 1;
        }
        return bVar;
    }
}
