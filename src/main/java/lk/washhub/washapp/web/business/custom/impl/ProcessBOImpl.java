package lk.washhub.washapp.web.business.custom.impl;

import lk.washhub.washapp.web.business.custom.ProcessBO;
import lk.washhub.washapp.web.business.util.EntityDTOMapper;
import lk.washhub.washapp.web.dao.ProcessDAO;
import lk.washhub.washapp.web.dto.ProcessDTO;
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
@Transactional
@Service
public class ProcessBOImpl implements ProcessBO {

    @Autowired
    private EntityDTOMapper mapper;

    @Autowired
    private ProcessDAO processDAO;

    public ProcessBOImpl() {
    }

    @Override
    public void saveProcess(ProcessDTO processDTO) throws Exception {
        processDAO.save(mapper.getProcess(processDTO));
    }

    @Override
    public void updateProcess(ProcessDTO processDTO) throws Exception {
        processDAO.save(mapper.getProcess(processDTO));
    }

    @Override
    public void deleteProcess(int key) throws Exception {
        processDAO.deleteById(key);
    }

    @Override
    public ProcessDTO getProcess(int key) throws Exception {
        return mapper.getProcessDTO(processDAO.getOne(key));
    }

    @Override
    public List<ProcessDTO> getAllProcess() throws Exception {
        return mapper.getAllProcessDTO(processDAO.findAll());
    }
}
