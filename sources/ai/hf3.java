package ai;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public abstract class hf3 implements m53 {

    /* renamed from: a  reason: collision with root package name */
    public final ff3 f4838a;

    /* renamed from: b  reason: collision with root package name */
    public final ff3 f4839b;

    public hf3(byte[] bArr) throws GeneralSecurityException {
        if (e83.a(1)) {
            this.f4838a = b(bArr, 1);
            this.f4839b = b(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    @Override // ai.m53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= (Integer.MAX_VALUE - this.f4838a.c()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f4838a.c() + length + 16);
            if (allocate.remaining() >= length + this.f4838a.c() + 16) {
                int position = allocate.position();
                this.f4838a.d(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f4838a.c()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr4 = new byte[32];
                this.f4839b.e(bArr3, 0).get(bArr4);
                int remaining = allocate.remaining();
                int i10 = remaining % 16;
                int i11 = i10 == 0 ? remaining : (remaining + 16) - i10;
                ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(allocate);
                order.position(i11);
                order.putLong(0L);
                order.putLong(remaining);
                byte[] a10 = cg3.a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a10);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract ff3 b(byte[] bArr, int i10) throws InvalidKeyException;
}
