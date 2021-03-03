package lk.washhub.washapp.web.business.custom.impl;

import lk.washhub.washapp.web.business.custom.RequestBO;
import lk.washhub.washapp.web.business.util.EntityDTOMapper;
import lk.washhub.washapp.web.dao.RequestDAO;
import lk.washhub.washapp.web.dto.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/

@Service
@Transactional
public class RequestBOImpl implements RequestBO {

    @Autowired
    private RequestDAO requestDAO;

    @Autowired
    private EntityDTOMapper mapper;

    @Override
    public void saveRequest(RequestDTO requestDTO) throws Exception {

    }

    @Override
    public void updateRequest(RequestDTO requestDTO) throws Exception {

    }

    @Override
    public RequestDTO getRequest(int key) throws Exception {
        return null;
    }

    @Override
    public List<RequestDTO> getAllRequest() throws Exception {
        return null;
    }
}
