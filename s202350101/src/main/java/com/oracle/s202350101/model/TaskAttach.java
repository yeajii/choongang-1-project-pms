package com.oracle.s202350101.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//@Date
@Getter
@Setter
@ToString
public class TaskAttach {



	private int		task_id;
	private int		project_id;
	private int		attach_no;
	private String attach_name;
	private String	attach_path;
}
