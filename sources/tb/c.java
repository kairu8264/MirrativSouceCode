package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ tb.a a(c cVar, String str, Integer num, String str2, String str3, String str4, Parcelable parcelable, String str5, Parcelable parcelable2, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                if ((i10 & 2) != 0) {
                    num = null;
                }
                if ((i10 & 4) != 0) {
                    str2 = null;
                }
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                if ((i10 & 16) != 0) {
                    str4 = null;
                }
                if ((i10 & 32) != 0) {
                    parcelable = null;
                }
                if ((i10 & 64) != 0) {
                    str5 = null;
                }
                if ((i10 & 128) != 0) {
                    parcelable2 = null;
                }
                if ((i10 & 256) != 0) {
                    z10 = true;
                }
                return cVar.j0(str, num, str2, str3, str4, parcelable, str5, parcelable2, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCommonPopupDialog");
        }

        public static /* synthetic */ Intent b(c cVar, Context context, ub.a aVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    aVar = ub.a.DETAIL;
                }
                return cVar.A(context, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createContractIntent");
        }

        public static /* synthetic */ Intent c(c cVar, Context context, Uri uri, float f10, float f11, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 16) != 0) {
                    z10 = false;
                }
                return cVar.v0(context, uri, f10, f11, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCropImageActivity");
        }

        public static /* synthetic */ tb.a d(c cVar, String str, Integer num, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = null;
                }
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                return cVar.T(str, num, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEmomoDressUpDialog");
        }

        public static /* synthetic */ Intent e(c cVar, Context context, Integer num, boolean z10, boolean z11, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = null;
                }
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                if ((i10 & 8) != 0) {
                    z11 = false;
                }
                return cVar.Z(context, num, z10, z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHomeEmomoActivity");
        }

        public static /* synthetic */ Intent f(c cVar, Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, int i10, Object obj) {
            if (obj == null) {
                return cVar.u0(context, str, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : str4, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? false : z12, (i10 & 256) != 0 ? false : z13, (i10 & 512) != 0 ? null : str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPlayerActivity");
        }

        public static /* synthetic */ Intent g(c cVar, Context context, String str, int i10, String str2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    str2 = null;
                }
                return cVar.g0(context, str, i10, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createProfileUserListActivityWithNoticeId");
        }

        public static /* synthetic */ tb.a h(c cVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                if ((i10 & 8) != 0) {
                    z10 = false;
                }
                return cVar.p(str, str2, str3, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRewardPostResultDialog");
        }

        public static /* synthetic */ tb.a i(c cVar, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    z10 = true;
                }
                if ((i10 & 8) != 0) {
                    z11 = true;
                }
                return cVar.m(str, str2, z10, z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createUserProfileDialog");
        }

        public static /* synthetic */ tb.a j(c cVar, String str, String str2, String str3, boolean z10, boolean z11, int i10, Object obj) {
            if (obj == null) {
                return cVar.W(str, str2, str3, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? true : z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createUserProfileDialogWithStreamerId");
        }
    }

    Intent A(Context context, ub.a aVar);

    tb.a A0(Context context, ub.b bVar);

    tb.a B(String str, String str2, boolean z10);

    Intent B0(Context context, int i10, String str);

    tb.a C(String str);

    Intent C0(Context context);

    Intent D(Context context);

    tb.a D0();

    Intent E(Context context, int i10, Integer num, String str);

    tb.a F(String str);

    Intent G(Context context, String str);

    tb.a H(String str, String str2);

    Intent I(Context context, String str, int i10);

    Intent J(Context context, int i10, Integer num, String str);

    Intent K(Context context, boolean z10, boolean z11, boolean z12);

    tb.a L(String str);

    Intent M(Context context, boolean z10, String str, String str2);

    Intent N(Context context, String str, int i10, boolean z10);

    tb.a O(boolean z10);

    b P(boolean z10);

    Intent Q(Context context, String str, String str2);

    b R();

    Intent S(Context context, String str);

    tb.a T(String str, Integer num, boolean z10);

    tb.a U(Parcelable parcelable, String str);

    Intent V(Context context);

    tb.a W(String str, String str2, String str3, boolean z10, boolean z11);

    Intent X(Context context, String str, int i10);

    Intent Y(Context context, Parcelable parcelable);

    Intent Z(Context context, Integer num, boolean z10, boolean z11);

    b a(String str, String str2, wb.a aVar);

    Intent a0(Context context, boolean z10, boolean z11, int i10, int i11, int i12, String str, String str2);

    tb.a b();

    Intent b0(Context context);

    tb.a c();

    tb.a c0(boolean z10);

    Intent d(Context context, String str, Serializable serializable, boolean z10, boolean z11);

    Intent d0(Context context, String str);

    Intent e(Context context);

    tb.a e0(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3);

    Intent f(Context context);

    tb.a f0(String str);

    tb.a g(boolean z10);

    Intent g0(Context context, String str, int i10, String str2);

    tb.a h(String str, boolean z10, int i10);

    tb.a h0(boolean z10);

    Intent i(Context context, Parcelable parcelable);

    tb.a i0(String str, String str2);

    tb.a j(String str);

    tb.a j0(String str, Integer num, String str2, String str3, String str4, Parcelable parcelable, String str5, Parcelable parcelable2, boolean z10);

    tb.a k();

    Intent k0(Context context, String str, String str2);

    Intent l(Context context);

    tb.a l0();

    tb.a m(String str, String str2, boolean z10, boolean z11);

    Intent m0(Context context);

    tb.a n(ub.c cVar);

    Intent n0(Context context);

    Intent o(Context context, Integer num);

    Intent o0(Context context);

    tb.a p(String str, String str2, String str3, boolean z10);

    tb.a p0(Context context, Parcelable parcelable);

    Intent q(Context context);

    Intent q0(Context context);

    Intent r(Context context, Parcelable parcelable, boolean z10);

    Intent r0(Context context, Integer num, String str, String str2);

    Intent s(Context context, String str, String str2);

    tb.a s0(List<? extends Parcelable> list, String str, boolean z10, int i10);

    Intent t(Context context, String str, Parcelable parcelable);

    Intent t0(Context context, String str, String str2, String str3, String str4, boolean z10, String str5);

    Intent u(Context context, String str, String str2, String str3, String str4, boolean z10, String str5);

    Intent u0(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5);

    Intent v(Context context, String str, String str2);

    Intent v0(Context context, Uri uri, float f10, float f11, boolean z10);

    tb.a w(String str);

    Intent w0(Context context, String str);

    Intent x(Context context, String str, Intent intent);

    Intent x0(Context context);

    tb.a y(String str, String str2);

    Intent y0(Context context);

    tb.a z(String str, String str2, String str3, String str4, String str5);

    Intent z0(Context context);
}
