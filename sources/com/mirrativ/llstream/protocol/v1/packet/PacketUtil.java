package com.mirrativ.llstream.protocol.v1.packet;

import com.mirrativ.llstream.protocol.v1.packet.PacketConstant;
import jo.h;
import jo.p;
import po.i;
import xn.o;

/* loaded from: classes4.dex */
public final class PacketUtil {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final boolean equalsByte(byte[] bArr, byte[] bArr2) {
            p.h(bArr, "src");
            p.h(bArr2, "target");
            if (bArr.length != bArr2.length) {
                return false;
            }
            int length = bArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equalsSyncByte(byte[] bArr) {
            p.h(bArr, "target");
            if (bArr.length >= 2 && 2 >= bArr.length) {
                byte b10 = bArr[0];
                PacketConstant.Companion companion = PacketConstant.Companion;
                return b10 == companion.getSYNC_BYTE()[0] && bArr[1] == companion.getSYNC_BYTE()[1];
            }
            return false;
        }

        public final boolean isAVCIDRPacket(byte[] bArr) {
            p.h(bArr, "packet");
            if (bArr.length >= 5 && isLLSPacket(bArr)) {
                return equalsByte(PacketConstant.Companion.getTopicByteVideoAVC_IDR(), o.X(bArr, new i(2, 4)));
            }
            return false;
        }

        public final boolean isAVCNDRPacket(byte[] bArr) {
            p.h(bArr, "packet");
            if (bArr.length >= 5 && isLLSPacket(bArr)) {
                return equalsByte(PacketConstant.Companion.getTopicByteVideoAVC_NDR(), o.X(bArr, new i(2, 4)));
            }
            return false;
        }

        public final boolean isLLSPacket(byte[] bArr) {
            p.h(bArr, "packet");
            return equalsByte(PacketConstant.Companion.getSYNC_BYTE(), o.X(bArr, new i(0, 1)));
        }
    }
}
