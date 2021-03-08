package lk.washhub.washapp.web.business.util;

import lk.washhub.washapp.web.dto.ProcessDTO;
import lk.washhub.washapp.web.dto.RequestDTO;
import lk.washhub.washapp.web.dto.StageDTO;
import lk.washhub.washapp.web.dto.UserDTO;
import lk.washhub.washapp.web.entity.Process;
import lk.washhub.washapp.web.entity.Request;
import lk.washhub.washapp.web.entity.Stage;
import lk.washhub.washapp.web.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/

@Mapper(componentModel = "spring")
public interface EntityDTOMapper {

    Process getProcess(ProcessDTO dto);

    ProcessDTO getProcessDTO(Process process);

    List<Process> getAllProcess(List<ProcessDTO> processDTOList);

    List<ProcessDTO> getAllProcessDTO(List<Process> processList);

    Request getRequest(RequestDTO dto);

    RequestDTO getRequestDTO(Request request);

    List<Request> getAllRequest(List<RequestDTO> requestDTOList);

    List<RequestDTO> getAllRequestDTO(List<Request> requestList);

    User getUser(UserDTO dto);

    UserDTO getUserDTO(User user);

    List<User> getAllUser(List<UserDTO> userDTOList);

    List<UserDTO> getAllUserDTO(List<User> userList);

    Stage getStage(StageDTO dto);

    StageDTO getStageDTO(Stage stage);

    List<Stage> getAllStage(List<StageDTO> stageDTOList);

    List<StageDTO> getAllStageDTO(List<Stage> stageList);
}
