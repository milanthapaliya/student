<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Students list</g:link></li>
            </ul>
        </div>
        <div id="show-student" class="content scaffold-show" role="main">

             <g:form resource="${this.student}" method="PUT">
                <g:hiddenField name="version" value="${this.student?.version}" />
                  <fieldset class="form">
                      <f:all bean="student"/>
                  </fieldset>
                  <fieldset class="buttons">
                    <input class="save" type="submit" value="update" />
                  </fieldset>
             </g:form>
            <g:form resource="${this.student}" method="DELETE" onsubmit="return confirm('Are you sure?');">
                <fieldset class="buttons">
                    <input class="delete" type="submit" value="delete" />
                </fieldset>
            </g:form>

        </div>
    </body>
</html>
