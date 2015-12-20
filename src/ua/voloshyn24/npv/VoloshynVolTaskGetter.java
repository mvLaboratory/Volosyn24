
package ua.voloshyn24.npv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.voloshyn24.task.Task;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tasks" type="{http://www.task.voloshyn24.com}task"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tasks"
})
@XmlRootElement(name = "VoloshynVolTaskGetter")
public class VoloshynVolTaskGetter {

    @XmlElement(required = true)
    protected Task tasks;

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link Task }
     *     
     */
    public Task getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Task }
     *     
     */
    public void setTasks(Task value) {
        this.tasks = value;
    }

}
