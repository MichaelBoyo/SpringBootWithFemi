package com.femisboot.springbootwithfemi.cloud;

import com.cloudinary.Cloudinary;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;



import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryServiceImpl implements CloudService {
    private final Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name","dfsn2ob9s",
            "api_key","157327745136222",
            "api_secret","LgmuK4NwR2Ay6JxK_j0j1-Q_M4o",
            "secure",true

    ));

    @Override
    public String upload(byte[] bytes, Map<?, ?> map) throws IOException {

        return cloudinary.uploader().upload(bytes, map).get("url").toString();
    }
}
