package org.ao.vhr.service;

import org.ao.vhr.mapper.HrMapper;
import org.ao.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HrService implements UserDetailsService {

    @Autowired
   HrMapper HrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = HrMapper.loadUserByUsername(username);

        if(hr==null){
            throw new UsernameNotFoundException("用户名不存在");
        }


        return null;
    }
}
